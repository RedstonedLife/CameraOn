package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

public class WebDetectFetcher extends PortTextFetcher {

    public WebDetectFetcher() {
        super( 80, "HEAD /robots.txt HTTP/1.0\r\n\r\n", "^[Ss]erver:\\s+(.*)$");
    }

    public String getId() {
        return "fetcher.webDetect";
    }
}
