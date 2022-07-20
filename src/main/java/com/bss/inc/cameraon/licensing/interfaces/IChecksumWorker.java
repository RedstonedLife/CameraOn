package com.bss.inc.cameraon.licensing.interfaces;

public interface IChecksumWorker {
    String buildProductKeyChecksum(String productKey);
    boolean verifyProductKeyChecksum(String productKey);
}
