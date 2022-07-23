package org.me.javawsdiscovery;

import java.net.URL;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Random;

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
}
