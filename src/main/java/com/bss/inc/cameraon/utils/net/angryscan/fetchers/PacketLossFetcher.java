package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.bss.inc.cameraon.utils.net.angryscan.state.PingerRegistry;

public class PacketLossFetcher extends PingFetcher {

    public PacketLossFetcher(PingerRegistry pingerRegistry, ScannerConfig scannerConfig) {
        super(pingerRegistry, scannerConfig);
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
