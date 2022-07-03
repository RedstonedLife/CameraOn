package com.bss.inc.cameraon.utils.net.angryscan.state;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;

import java.io.IOException;

import static java.lang.Math.max;

public class CombinedUnprivilegedPinger implements Pinger {
    private TCPPinger tcpPinger;
    private UDPPinger udpPinger;

    public CombinedUnprivilegedPinger(TCPPinger tcpPinger, UDPPinger udpPinger) {
        this.tcpPinger = tcpPinger;
        this.udpPinger = udpPinger;
    }

    public PingResult ping(ScanningSubject subject, int count) throws IOException {
        // try UDP first - it should be more reliable in general
        int udpCountInitialCount = max(1, count / 2);
        PingResult udpResult = udpPinger.ping(subject, udpCountInitialCount);
        if (udpResult.isAlive())
            return udpResult.merge(udpPinger.ping(subject, count - udpCountInitialCount));

        // fallback to TCP - it may detect some hosts UDP cannot
        return tcpPinger.ping(subject, count);
    }
}
