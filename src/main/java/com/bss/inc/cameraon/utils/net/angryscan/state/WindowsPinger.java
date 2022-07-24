package com.bss.inc.cameraon.utils.net.angryscan.state;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.WinIpHlpDll;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;

import java.io.IOException;
import java.util.Arrays;

import static com.bss.inc.cameraon.utils.net.angryscan.WinIpHlp.toIp6Addr;
import static com.bss.inc.cameraon.utils.net.angryscan.WinIpHlp.toIpAddr;
import static com.bss.inc.cameraon.utils.net.angryscan.WinIpHlpDll.dll;
import static java.lang.Thread.currentThread;

public class WindowsPinger implements Pinger {
    private int timeout;
    private WinIpHlpDll.Ip6SockAddrByRef anyIp6SourceAddr = new WinIpHlpDll.Ip6SockAddrByRef();

    public WindowsPinger(ScannerConfig config) {
        this.timeout = config.pingTimeout;
    }

    public PingResult ping(ScanningSubject subject, int count) throws IOException {
        if (subject.isIPv6())
            return ping6(subject, count);
        else
            return ping4(subject, count);
    }

    private PingResult ping4(ScanningSubject subject, int count) throws IOException {
        Pointer handle = dll.IcmpCreateFile();
        if (handle == null) throw new IOException("Unable to create Windows native ICMP handle");

        int sendDataSize = 32;
        int replyDataSize = sendDataSize + (new WinIpHlpDll.IcmpEchoReply().size()) + 10;
        Pointer sendData = new Memory(sendDataSize);
        sendData.clear(sendDataSize);
        Pointer replyData = new Memory(replyDataSize);

        PingResult result = new PingResult(subject.getAddress(), count);
        try {
            WinIpHlpDll.IpAddrByVal ipaddr = toIpAddr(subject.getAddress());
            for (int i = 1; i <= count && !currentThread().isInterrupted(); i++) {
                int numReplies = dll.IcmpSendEcho(handle, ipaddr, sendData, (short) sendDataSize, null, replyData, replyDataSize, timeout);
                WinIpHlpDll.IcmpEchoReply echoReply = new WinIpHlpDll.IcmpEchoReply(replyData);
                if (numReplies > 0 && echoReply.status == 0 && Arrays.equals(echoReply.address.bytes, ipaddr.bytes)) {
                    result.addReply(echoReply.roundTripTime);
                    result.setTTL(echoReply.options.ttl & 0xFF);
                }
            }
        }
        finally {
            dll.IcmpCloseHandle(handle);
        }
        return result;
    }

    private PingResult ping6(ScanningSubject subject, int count) throws IOException {
        Pointer handle = dll.Icmp6CreateFile();
        if (handle == null) throw new IOException("Unable to create Windows native ICMP6 handle");

        int sendDataSize = 32;
        int replyDataSize = sendDataSize + (new WinIpHlpDll.Icmp6EchoReply().size()) + 10;
        Pointer sendData = new Memory(sendDataSize);
        sendData.clear(sendDataSize);
        Pointer replyData = new Memory(replyDataSize);

        PingResult result = new PingResult(subject.getAddress(), count);
        try {
            WinIpHlpDll.Ip6SockAddrByRef ipaddr = toIp6Addr(subject.getAddress());
            for (int i = 1; i <= count && !currentThread().isInterrupted(); i++) {
                int numReplies = dll.Icmp6SendEcho2(handle, null, null, null, anyIp6SourceAddr, toIp6Addr(subject.getAddress()),
                        sendData, (short) sendDataSize, null, replyData, replyDataSize, timeout);
                Icmp6EchoReply echoReply = new Icmp6EchoReply(replyData);
                if (numReplies > 0 && echoReply.status == 0 && Arrays.equals(echoReply.addressBytes, ipaddr.bytes)) {
                    result.addReply(echoReply.roundTripTime);
                }
            }
        }
        finally {
            dll.IcmpCloseHandle(handle);
        }

        return result;
    }
}
