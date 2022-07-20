package com.bss.inc.cameraon.licensing.impl.workers;

import com.bss.inc.cameraon.licensing.impl.beans.ProductKeyEncodingData;
import com.bss.inc.cameraon.licensing.interfaces.IProductKeySectionWorker;

public class ProductKeySectionWorker implements IProductKeySectionWorker<ProductKeyEncodingData> {
    @Override public byte buildProductKeySection(final long seed, final ProductKeyEncodingData encodingData) {byte a = (byte) (((int) encodingData.getA()) % 25);byte b = (byte) (((int) encodingData.getB()) % 3);if (((int) a) % 2 == 0) {return (byte) (((seed >> a) & 0x000000FF) ^ ((seed >> b) | encodingData.getC()));} else {return (byte) (((seed >> a) & 0x000000FF) ^ ((seed >> b) & encodingData.getC()));}}
}
