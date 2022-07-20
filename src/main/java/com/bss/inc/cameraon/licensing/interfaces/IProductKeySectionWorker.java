package com.bss.inc.cameraon.licensing.interfaces;

public interface IProductKeySectionWorker<ED extends ProductKeyEncodingData> {
    byte buildProductKeySection(final long seed, ED productKeyEncodingDate);
}
