package com.bss.inc.cameraon.utils.net.angryscan.feeders;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningSubject;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.core.Plugin;

import java.net.InetAddress;

public interface Feeder extends Plugin {
    /**
     * @return true in case there are more IPs left for processing
     */
    boolean hasNext();

    /**
     * @return the next IP for processing
     */
    ScanningSubject next();

    /**
     * @return value from 0 to 100, describing the amount of work already done
     */
    int percentageComplete();

    /**
     * @return information about feeder's current settings.
     * Used for creation of Favorites, saving to file, etc.
     */
    String getInfo();

    /**
     * @return true if scanning LAN addresses, so that ARP, etc can be used
     */
    default boolean isLocalNetwork() {
        return false;
    }

    default ScanningSubject subject(InetAddress ip) {
        return new ScanningSubject(ip);
    }
}
