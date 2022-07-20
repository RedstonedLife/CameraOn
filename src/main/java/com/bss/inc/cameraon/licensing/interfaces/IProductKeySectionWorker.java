package com.bss.inc.cameraon.licensing.interfaces;

public class IProductKeySectionWorker<ED extends ProductKeyEncodingData> {
    byte buildProductKeySection(final long seed, ED productKeyEncodingDate);
}
