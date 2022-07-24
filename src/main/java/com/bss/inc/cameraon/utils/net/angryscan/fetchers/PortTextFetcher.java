package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.logging.Level;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningResult;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.config.LoggerFactory;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.bss.inc.cameraon.utils.net.angryscan.fetchers.PortsFetcher.PARAMETER_OPEN_PORTS;
import static java.lang.Thread.currentThread;
import static java.util.Collections.singleton;

public abstract class PortTextFetcher extends AbstractFetcher {
    private static final Logger LOG = LoggerFactory.getLogger();

    private ScannerConfig scannerConfig;

    private int defaultPort;
    protected boolean scanOpenPorts;
    protected String textToSend;
    protected Pattern matchingRegexp;
    protected int extractGroup;

    public PortTextFetcher(int defaultPort, String defaultTextToSend, String matchingRegexp) {
        this.scannerConfig = MainClass.getConfig().forScanner();
        this.defaultPort = defaultPort;
        this.textToSend = getPreferences().get("textToSend", defaultTextToSend);
        this.matchingRegexp = Pattern.compile(getPreferences().get("matchingRegexp", matchingRegexp));
        this.extractGroup = getPreferences().getInt("extractGroup", 1);
    }

    public Object scan(ScanningSubject subject) {
        Iterator<Integer> portIterator = getPortIterator(subject);

        while (portIterator.hasNext() && !currentThread().isInterrupted()) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(subject.getAddress(), portIterator.next()), subject.getAdaptedPortTimeout());
                socket.setTcpNoDelay(true);
                socket.setSoTimeout(scannerConfig.portTimeout * 2);
                socket.setSoLinger(true, 0);

                socket.getOutputStream().write(textToSend.getBytes());

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    Matcher matcher = matchingRegexp.matcher(line);
                    if (matcher.find()) {
                        // mark that additional info is available
                        subject.setResultType(ScanningResult.ResultType.WITH_PORTS);
                        // return the required contents
                        return getResult(matcher, socket.getPort());
                    }
                }
            }
            catch (ConnectException e) {
                // no connection
            }
            catch (SocketTimeoutException e) {
                // no information
            }
            catch (SocketException e) {
                // connection reset
            }
            catch (IOException e) {
                LOG.log(Level.INFO, subject.getAddress().toString(), e);
            }
        }
        return null;
    }

    protected String getResult(Matcher matcher, int port) {
        String result = matcher.group(extractGroup);
        return result.isEmpty() ? String.valueOf(port) : result;
    }

    private Iterator<Integer> getPortIterator(ScanningSubject subject) {
        if (scanOpenPorts) {
            @SuppressWarnings("unchecked")
            SortedSet<Integer> openPorts = (SortedSet<Integer>) subject.getParameter(PARAMETER_OPEN_PORTS);
            if (openPorts != null) {
                SortedSet<Integer> ports = new TreeSet<>(openPorts);
                ports.add(defaultPort);
                return ports.iterator();
            }
        }
        return subject.isAnyPortRequested() ? subject.requestedPortsIterator() : singleton(defaultPort).iterator();
    }

    @Override
    public Class<? extends FetcherPrefs> getPreferencesClass() {
        return null;
    }

    public String getTextToSend() {
        return textToSend;
    }

    public void setTextToSend(String textToSend) {
        this.textToSend = textToSend;
    }

    public Pattern getMatchingRegexp() {
        return matchingRegexp;
    }

    public void setMatchingRegexp(Pattern matchingRegexp) {
        this.matchingRegexp = matchingRegexp;
    }

    public int getExtractGroup() {
        return extractGroup;
    }

    public void setExtractGroup(int extractGroup) {
        this.extractGroup = extractGroup;
    }
}