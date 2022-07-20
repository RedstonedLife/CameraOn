package com.bss.inc.cameraon.licensing;

import com.bss.inc.cameraon.licensing.enums.ProductKeyState;
import com.bss.inc.cameraon.licensing.impl.beans.ProductKeyEncodingData;
import com.bss.inc.cameraon.licensing.interfaces.*;
import com.bss.inc.cameraon.licensing.utils.ProductKeyUtils;
import com.bss.inc.cameraon.logging.Logger;

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
            if(this.getProductKeyStylingWorker() != null) {cleanedProductKey = this.getProductKeyStylingWorker().removeStyling(productKey).toUpperCase();}
            else {cleanedProductKey = productKey.toUpperCase();}
            // Verify Product Key format is valid
            if((this.getChecksumWorker() != null) && ( !this.getChecksumWorker().verifyProductKeyChecksum(cleanedProductKey))) {return ProductKeyState.KEY_INVALID;}
            // Test against blacklist (No. 1, Elizabeth Keen) (Totally not a "the Blacklist" reference, not at all ;) )
            if((this.getBlacklistWorker() != null) && this.getBlacklistWorker().isKeyBlackListed(cleanedProductKey)) {return ProductKeyState.KEY_BLACKLISTED;}
            // If the product-key section bytes are present and valid in length, then verify the product-key sections
            if((this.productKeyEncodingData != null) && (this.productKeyEncodingData.length >0)) {
                if(this.getProductKeySectionWorker() != null) {
                    try {
                        long seed = Long.parseLong(cleanedProductKey.substring(0, this.getSeedCharLength()), 16);
                        int currentKeyCharIndex = this.getSeedCharLength();
                        String tmpKeySection;
                        for(int n=0;n<this.productKeyEncodingData.length;n++) {
                            if(this.productKeyEncodingData[n] != null) {
                                tmpKeySection=cleanedProductKey.substring(currentKeyCharIndex,currentKeyCharIndex+2);
                                if(!tmpKeySection.equals(ProductKeyUtils.buildHexStr(2, this.getProductKeySectionWorker().buildProductKeySection(seed, this.productKeyEncodingData[n])))) return ProductKeyState.KEY_PHONY;
                            }
                            currentKeyCharIndex += 2;
                        }
                        return ProductKeyState.KEY_GOOD;
                    } catch (NumberFormatException nfe) {
                        Logger.getLogger("BNC").error("Exception caught", nfe);
                    }
                }
                
            }
        }
    }
}
