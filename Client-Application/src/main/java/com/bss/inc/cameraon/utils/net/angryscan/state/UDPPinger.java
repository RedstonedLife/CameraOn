package com.bss.inc.cameraon.utils.net.angryscan.state;

import com.bss.inc.cameraon.logging.Level;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.config.LoggerFactory;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;

import static com.bss.inc.cameraon.utils.net.angryscan.utils.IOUtils.closeQuietly;

public class UDPPinger implements Pinger {
    private static final Logger LOG = LoggerFactory.getLogger();

    private static final int PROBE_UDP_PORT = 37381;

    private int timeout;

    public UDPPinger(ScannerConfig config) {
        this.timeout = config.pingTimeout;
    }

    public PingResult ping(ScanningSubject subject, int count) throws IOException {
        PingResult result = new PingResult(subject.getAddress(), count);

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            socket.setSoTimeout(timeout);
            socket.connect(subject.getAddress(), PROBE_UDP_PORT);

            for (int i = 0; i < count && !Thread.currentThread().isInterrupted(); i++) {
                byte[] payload = new byte[8];
                long startTime = System.currentTimeMillis();
                ByteBuffer.wrap(payload).putLong(startTime);
                DatagramPacket packet = new DatagramPacket(payload, payload.length);
                try {
                    socket.send(packet);
                    socket.receive(packet);
                }
                catch (PortUnreachableException e) {
                    result.addReply(System.currentTimeMillis() - startTime);
                }
                catch (SocketTimeoutException ignore) {
                }
                catch (NoRouteToHostException e) {
                    // this means that the host is down
                    break;
                }
                catch (SocketException e) {
                    if (e.getMessage().contains(/*No*/"route to host")) {
                        // sometimes 'No route to host' also gets here...
                        break;
                    }
                }
                catch (IOException e) {
                    if (e.getMessage().startsWith("Network is unreachable"))
                        break;
                    LOG.log(Level.OFF, subject.toString(), e);
                }
            }
            return result;
        }
        finally {
            closeQuietly(socket);
        }
    }
}
