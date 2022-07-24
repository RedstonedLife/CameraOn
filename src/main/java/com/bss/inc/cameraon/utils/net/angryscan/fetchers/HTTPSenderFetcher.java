package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;

public class HTTPSenderFetcher extends PortTextFetcher {
    public HTTPSenderFetcher() {
        super( 80, "HEAD / HTTP/1.0\r\n\r\n", "Date: (.*)$");
    }

    public String getId() {
        return "fetcher.httpSender";
    }
}