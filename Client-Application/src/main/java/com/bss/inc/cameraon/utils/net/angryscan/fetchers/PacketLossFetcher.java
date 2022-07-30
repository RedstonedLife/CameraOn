package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.state.PingResult;

import static com.bss.inc.cameraon.utils.net.angryscan.ScanningResult.ResultType.ALIVE;
import static com.bss.inc.cameraon.utils.net.angryscan.ScanningResult.ResultType.DEAD;

public class PacketLossFetcher extends PingFetcher {

    public PacketLossFetcher() {
        super();
    }

    public String getId() {
        return "fetcher.packetloss";
    }

    public Object scan(ScanningSubject subject) {
        PingResult result = executePing(subject);
        subject.setResultType(result.isAlive() ? ALIVE : DEAD);

        return result.getPacketLoss() + "/" + result.getPacketCount() + " (" + result.getPacketLossPercent() + "%)";
    }
}
