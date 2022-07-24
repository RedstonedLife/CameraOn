package com.bss.inc.cameraon.utils.net.angryscan;

import com.bss.inc.cameraon.utils.net.angryscan.WinIpHlpDll.Ip6SockAddrByRef;
import com.bss.inc.cameraon.utils.net.angryscan.WinIpHlpDll.IpAddrByVal;

import java.net.InetAddress;

public class WinIpHlp {
    public static IpAddrByVal toIpAddr(InetAddress address) {
        IpAddrByVal addr = new IpAddrByVal();
        addr.bytes = address.getAddress();
        return addr;
    }

    public static Ip6SockAddrByRef toIp6Addr(InetAddress address) {
        Ip6SockAddrByRef addr = new Ip6SockAddrByRef();
        addr.bytes = address.getAddress();
        return addr;
    }
}
