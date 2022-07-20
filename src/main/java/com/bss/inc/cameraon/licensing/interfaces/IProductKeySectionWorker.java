package com.bss.inc.cameraon.licensing.interfaces;

public interface IProductKeySectionWorker<ED extends IProductKeyEncodingData> {
    byte buildProductKeySection(final long seed, ED productKeyEncodingDate);
}
