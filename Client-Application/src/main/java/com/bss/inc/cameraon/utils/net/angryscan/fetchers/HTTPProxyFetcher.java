package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import java.util.regex.Matcher;

public class HTTPProxyFetcher extends PortTextFetcher {
    public HTTPProxyFetcher() {
        super( 3128, "HEAD http://www.google.com HTTP/1.0\r\n\r\n", "^(HTTP/[\\d\\.]+ [23].*)$");
        this.scanOpenPorts = true;
    }

    public String getId() {
        return "fetcher.httpProxy";
    }

    @Override
    protected String getResult(Matcher matcher, int port) {
        return port + ": " + super.getResult(matcher, port);
    }
}
