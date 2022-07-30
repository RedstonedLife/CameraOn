package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningResult;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.state.PingResult;

public class PingTTLFetcher extends PingFetcher {

    public PingTTLFetcher() {
        super();
    }

    public String getId() {
        return "fetcher.ping.ttl";
    }

    public Object scan(ScanningSubject subject) {
        PingResult result = executePing(subject);
        subject.setResultType(result.isAlive() ? ScanningResult.ResultType.ALIVE : ScanningResult.ResultType.DEAD);
        return result.isAlive() && result.getTTL() > 0 ? result.getTTL() : null;
    }
}
