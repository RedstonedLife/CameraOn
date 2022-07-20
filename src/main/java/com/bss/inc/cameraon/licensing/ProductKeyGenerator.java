package com.bss.inc.cameraon.licensing;

import com.bss.inc.cameraon.licensing.impl.beans.ProductKeyEncodingData;
import com.bss.inc.cameraon.licensing.impl.workers.ProductKeySectionWorker;

public abstract class ProductKeyGenerator<ED extends ProductKeyEncodingData> {
    private final int seedCharLength;
    private final ED[] productKeyEncodingData;
    private ProductKeySectionWorker<ED> productKeySectionWorker = null;
    
}
