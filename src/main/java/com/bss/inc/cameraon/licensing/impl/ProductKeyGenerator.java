package com.bss.inc.cameraon.licensing.impl;

import com.bss.inc.cameraon.licensing.impl.beans.ProductKeyEncodingData;
import com.bss.inc.cameraon.licensing.interfaces.IProductKeySectionWorker;

public class ProductKeyGenerator extends com.bss.inc.cameraon.licensing.ProductKeyGenerator<ProductKeyEncodingData> {
    public ProductKeyGenerator(final ProductKeyEncodingData...productKeyEncodingData) {super(8, productKeyEncodingData);}
    @Override
    protected IProductKeySectionWorker<ProductKeyEncodingData> buildProductKeySectionWorker()
    {
        return new BasicProductKeySectionWorker();
    }

    @Override
    protected IChecksumWorker buildChecksumWorker()
    {
        return new BasicChecksumWorker();
    }

    @Override
    protected IBlacklistWorker buildBlacklistWorker()
    {
        return null;
    }

    @Override
    protected IProductKeyStylingWorker buildProductKeyStylingWorker()
    {
        return new BasicProductKeyStylingWorker();
    }

    @Override
    protected ISeedAvailabilityWorker buildSeedAvailabilityWorker()
    {
        return null;
    }
}
