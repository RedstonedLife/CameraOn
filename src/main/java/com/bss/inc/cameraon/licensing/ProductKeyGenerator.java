package com.bss.inc.cameraon.licensing;

import com.bss.inc.cameraon.licensing.enums.ProductKeyState;
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
    @SafeVarargs public ProductKeyGenerator(final int seedCharLength, final ED...productKeyEncodingData) {this.seedCharLength = ((seedCharLength > 0) && (seedCharLength <= 15)) ? seedCharLength : 10;if((productKeyEncodingData != null) && (productKeyEncodingData.length > 0)) {this.productKeyEncodingData = productKeyEncodingData;}else{this.productKeyEncodingData=null;}}
    public int getSeedCharLength() {return this.seedCharLength;}
    public ProductKeyState verifyProductKey(final String productKey) {
        if((productKey != null) && (productKey.trim().length() > 0)) {
            final String cleanedProductKey;
            if(this.getProductKeyStylingWorker() != null) {
                cleanedProductKey = this.getProductKeyStylingWorker().removeStyling(productKey).toUpperCase();}
        }
    }
}
