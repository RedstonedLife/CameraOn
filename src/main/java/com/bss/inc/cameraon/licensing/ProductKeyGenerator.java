package com.bss.inc.cameraon.licensing;

import com.bss.inc.cameraon.licensing.impl.beans.ProductKeyEncodingData;
import com.bss.inc.cameraon.licensing.interfaces.*;

public abstract class ProductKeyGenerator<ED extends ProductKeyEncodingData> {
    private final int seedCharLength;
    private final ED[] productKeyEncodingData;
    private IProductKeySectionWorker<ED> productKeySectionWorker = null;
    private IChecksumWorker checksumWorker = null;
    private IBlacklistWorker blacklistWorker = null;
    private IProductKeyStylingWorker productKeyStylingWorker = null;
    private ISeedAvailabilityWorker seedAvailabilityWorker = null;
    
}
