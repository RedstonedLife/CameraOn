package org.me.javawsdiscovery;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.*;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DeviceDiscovery {
    public static int WS_DISCOVERY_TIMEOUT = 4000;
    public static int WS_DISCOVERY_PORT = 3702;
    public static String WS_DISCOVERY_ADDRESS_IPv4 = "239.255.255.250";
    public static String WS_DISCOVERY_ADDRESS_IPv6 = "[FF02::C]";
    public static String WS_DISCOVERY_PROBE_MESSAGE = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wsa=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" xmlns:tns=\"http://schemas.xmlsoap.org/ws/2005/04/discovery\"><soap:Header><wsa:Action>http://schemas.xmlsoap.org/ws/2005/04/discovery/Probe</wsa:Action><wsa:MessageID>urn:uuid:c032cfdd-c3ca-49dc-820e-ee6696ad63e2</wsa:MessageID><wsa:To>urn:schemas-xmlsoap-org:ws:2005:04:discovery</wsa:To></soap:Header><soap:Body><tns:Probe/></soap:Body></soap:Envelope>";
    private static final Random random = new SecureRandom();

    public static Collection<URL> discoverWsDevicesAsUrls() {
        return discoverWsDevicesAsUrls("","");
    }

    public static Collection<URL> discoverWsDevicesAsUrls(String regxpProtocol, String regexpPath) {
        Collection<URL> urls = new TreeSet<>(new Comparator<URL>() {
            public int compare(URL o1, URL o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        for (String key : discoverWsDevices()) {
            try {
                URL url = new URL(key);
                boolean ok = true;
                if (regexpProtocol.length() > 0 && !url.getProtocol().matches(regexpProtocol))
                    ok = false;
                if (regexpPath.length() > 0 && !url.getPath().matches(regexpPath))
                    ok = false;
                if (ok)
                    urls.add(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return urls;
    }

    public static Collection<String> discoverWsDevices() {
        final Collection<String> addresses = new TreeSet<>();
        final CountDownLatch serverStarted = new CountDownLatch(1);
        final CountDownLatch serverFinished = new CountDownLatch(1);
        try {
            String uuid = UUID.randomUUID().toString();
            WS_DISCOVERY_PROBE_MESSAGE = WS_DISCOVERY_PROBE_MESSAGE.replaceAll("<wsa:MessageID>urn:uuid:.*</wsa:MessageID>", "<wsa:MessageID>urn:uuid:" + uuid + "</wsa:MessageID>");
            int port = random.nextInt(20000) + 40000;
            final DatagramSocket server = new DatagramSocket(port);
            (new Thread() {
                public void run() {
                    try {
                        DatagramPacket packet = new DatagramPacket(new byte[4096], 4096);
                        server.setSoTimeout(DeviceDiscovery.WS_DISCOVERY_TIMEOUT);
                        long timerStarted = System.currentTimeMillis();
                        while (System.currentTimeMillis() - timerStarted < DeviceDiscovery.WS_DISCOVERY_TIMEOUT) {
                            serverStarted.countDown();
                            server.receive(packet);
                            Collection<String> collection = DeviceDiscovery.parseSoapResponseForUrls(Arrays.copyOf(packet.getData(), packet.getLength()));
                            for (String key : collection)
                                addresses.add(key);
                        }
                    } catch (SocketTimeoutException ignored) {

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        serverFinished.countDown();
                        server.close();
                    }
                }
            }).start();
            try {
                serverStarted.await(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            server.send(new DatagramPacket(WS_DISCOVERY_PROBE_MESSAGE.getBytes(), WS_DISCOVERY_PROBE_MESSAGE.length(), InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv4), WS_DISCOVERY_PORT));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            serverFinished.await(WS_DISCOVERY_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return addresses;
    }

    private static Collection<Node> getNodeMatching(Node body, String regexp) {
        Collection<Node> nodes = new ArrayList<>();
        if (body.getNodeName().matches(regexp))
            nodes.add(body);
        if (body.getChildNodes().getLength() == 0)
            return nodes;
        NodeList returnList = body.getChildNodes();
        for (int k = 0; k < returnList.getLength(); k++) {
            Node node = returnList.item(k);
            nodes.addAll(getNodeMatching(node, regexp));
        }
        return nodes;
    }

    private static Collection<String> parseSoapResponseForUrls(byte[] data) throws SOAPException, IOException {
        Collection<String> urls = new ArrayList<>();
        MessageFactory factory = MessageFactory.newInstance("SOAP 1.2 Protocol");
        MimeHeaders headers = new MimeHeaders();
        headers.addHeader("Content-type", "application/soap+xml");
        SOAPMessage message = factory.createMessage(headers, new ByteArrayInputStream(data));
        SOAPBody body = message.getSOAPBody();
        for (Node node : getNodeMatching((Node)body, ".*:XAddrs")) {
            if (node.getTextContent().length() > 0)
                urls.addAll(Arrays.asList(node.getTextContent().split(" ")));
        }
        return urls;
    }
}
