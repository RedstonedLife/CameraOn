package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;

import java.net.Inet4Address;

import static com.bss.inc.cameraon.utils.net.angryscan.WinIpHlp.toIpAddr;
import static com.bss.inc.cameraon.utils.net.angryscan.WinIpHlpDll.dll;


public class WinMACFetcher extends MACFetcher {
    @Override public String resolveMAC(ScanningSubject subject) {
        if (!(subject.getAddress() instanceof Inet4Address)) return null; // TODO IPv6 support

        Pointer pmac = new Memory(8);
        Pointer plen = new Memory(4);
        plen.setInt(0, 8);

        int result = dll.SendARP(toIpAddr(subject.getAddress()), 0, pmac, plen);

        if (result != 0) return null;

        byte[] bytes = pmac.getByteArray(0, plen.getInt(0));
        return bytesToMAC(bytes);
    }
}
