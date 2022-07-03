package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.values.InetAddressHolder;

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
