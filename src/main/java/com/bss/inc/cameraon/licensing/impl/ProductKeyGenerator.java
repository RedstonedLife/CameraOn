package com.bss.inc.cameraon.licensing.impl;

import com.bss.inc.cameraon.licensing.impl.beans.ProductKeyEncodingData;
import com.bss.inc.cameraon.licensing.impl.workers.ChecksumWorker;
import com.bss.inc.cameraon.licensing.impl.workers.ProductKeySectionWorker;
import com.bss.inc.cameraon.licensing.impl.workers.ProductKeyStylingWorker;
import com.bss.inc.cameraon.licensing.interfaces.*;

public class ProductKeyGenerator extends com.bss.inc.cameraon.licensing.ProductKeyGenerator<ProductKeyEncodingData> {
    public ProductKeyGenerator(final ProductKeyEncodingData...productKeyEncodingData) {super(8, productKeyEncodingData);}
    @Override
    protected IProductKeySectionWorker<ProductKeyEncodingData> buildProductKeySectionWorker()
    {
        return new ProductKeySectionWorker();
    }
    @Override protected IChecksumWorker buildChecksumWorker() {return new ChecksumWorker();}
    @Override protected IBlacklistWorker buildBlacklistWorker() {return null;}
    @Override protected IProductKeyStylingWorker buildProductKeyStylingWorker() {return new ProductKeyStylingWorker();}
    @Override protected ISeedAvailabilityWorker buildSeedAvailabilityWorker() {return null;}
}
