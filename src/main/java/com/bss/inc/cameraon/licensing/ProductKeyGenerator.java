package com.bss.inc.cameraon.licensing;

import com.bss.inc.cameraon.licensing.enums.ProductKeyState;
import com.bss.inc.cameraon.licensing.exceptions.*;
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
        return ProductKeyState.KEY_PHONY;
    }

    public String generateProductKey(long seed) throws ProductKeyGenerationException
    {
        // Build the HEXADECIMAL string representing the seed.
        String seedHex = ProductKeyUtils.buildHexStr(this.getSeedCharLength(), seed);
        try {
            // Try to parse the HEXADECIMAL string representing the seed and use that for the seed.
            seed = Long.parseLong(seedHex, 16);
            if ((this.productKeyEncodingData != null) && (this.productKeyEncodingData.length > 0)) {if (this.getProductKeySectionWorker() != null) {
                final StringBuilder keySb = new StringBuilder();

                    seedHex = ProductKeyUtils.buildHexStr(this.getSeedCharLength(), seed);

                    if ((this.getBlacklistWorker() != null) && (this.getBlacklistWorker().isSeedBlackListed(seedHex)))
                    {
                        throw new SeedIsBlacklistedException();
                    }

                    if ((this.getSeedAvailabilityWorker() != null) && ( !this.getSeedAvailabilityWorker().isSeedAvailable(seedHex)))
                    {
                        throw new SeedAlreadyTakenException();
                    }

                    // The key string begins with a HEXADECIMAL string of the seed.
                    keySb.append(seedHex);

                    // Build the byte for the key-section derived from the seed.
                    for (int n = 0; n < this.productKeyEncodingData.length; n++ )
                    {
                        if (this.productKeyEncodingData[n] == null)
                        {
                            throw new EncodingDataNotCompleteException();
                        }

                        keySb.append(ProductKeyUtils.buildHexStr(2, this.getProductKeySectionWorker().buildProductKeySection(seed, this.productKeyEncodingData[n])));
                    }

                    // Add checksum to key string.
                    if (this.getChecksumWorker() != null)
                    {
                        keySb.append(this.getChecksumWorker().buildProductKeyChecksum(keySb.toString()));
                    }

                    // Add dashes to the product-key and return it.
                    if (this.getProductKeyStylingWorker() != null)
                    {
                        return this.getProductKeyStylingWorker().addStyling(keySb.toString());
                    }

                    return keySb.toString();
                }
                else
                {
                    throw new ProductKeyEncoderNotDefinedException();
                }
            }
            else
            {
                throw new EncodingDataNotCompleteException();
            }
        }
        catch (NumberFormatException nfe)
        {
            throw new InvalidSeedException();
        }
    }
}
