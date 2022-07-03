package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningSubject;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.values.InetAddressHolder;

public class IPFetcher extends AbstractFetcher {
    public IPFetcher() {}

    public static final String ID = "fetcher.ip";

    public String getId() {
        return ID;
    }

    public Object scan(ScanningSubject subject) {
        return new InetAddressHolder(subject.getAddress());
    }

}
