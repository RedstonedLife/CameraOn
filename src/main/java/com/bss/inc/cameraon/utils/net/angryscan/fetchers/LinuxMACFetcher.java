package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LinuxMACFetcher {
    private static final Path ARP_TABLE = Path.of("/proc/net/arp");
    private int flagsIndex;
    private int macIndex;
    private int macLength = 17;

    public LinuxMACFetcher() {
        String line = arpLines().findFirst().get();
        flagsIndex = line.indexOf("Flags");
        macIndex = line.indexOf("HW addr");
    }

    private static Stream<String> arpLines() {
        try {
            return Files.lines(ARP_TABLE);
        } catch (Exception e) {
            return Stream.empty();
        }
    }

    @Override public String resolveMAC(ScanningSubject subject) {
        try {
            String ip = subject.getAddress().getHostAddress();
            return arpLines()
                    .filter(line -> line.startsWith(ip + " ") && !line.substring(flagsIndex, flagsIndex + 3).equals("0x0")).findFirst()
                    .map(line -> line.substring(macIndex, macIndex + macLength).toUpperCase())
                    .orElse(getLocalMAC(subject));
        }
        catch (Exception e) {
            return null;
        }
    }
}
