package com.bss.inc.cameraon.licensing.interfaces;

public interface IBlacklistWorker {
    boolean isKeyBlackListed(String productKey);
    boolean isSeedBlackListed(String seedHex);
}
