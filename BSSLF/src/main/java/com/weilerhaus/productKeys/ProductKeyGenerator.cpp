// Include header file
#include <iostream>
#include <string>
#include <stdexcept>
#include <vector>
#include <algorithm>
#include "StringUtils.h"
#include "ProductKeyGenerator.h"
#include "StringUtils.h"

template<typename ED extends ProductKeyEncodingData>
class ProductKeyGenerator
{
private:
    int seedCharLength;
    std::vector<ED*> productKeyEncodingData;
    ProductKeySectionWorker* productKeySectionWorker = nullptr;
    ChecksumWorker* checksumWorker = nullptr;
    BlacklistWorker* blacklistWorker = nullptr;
    ProductKeyStylingWorker* productKeyStylingWorker = nullptr;
    SeedAvailabilityWorker* seedAvailabilityWorker = nullptr;
public :
public
    ProductKeyGenerator(int seedCharLength, params ED[] productKeyEncodingData)
    {
        this->seedCharLength = ((((seedCharLength > 0) && (seedCharLength <= 15))) ? seedCharLength : 10);
        if ((productKeyEncodingData != nullptr) && (productKeyEncodingData.size() > 0))
        {
            this->productKeyEncodingData = productKeyEncodingData;
        }
        else
        {
            this->productKeyEncodingData = nullptr;
        }
    }
    int getSeedCharLength()
    {
        return this->seedCharLength;
    }
    ProductKeyState* verifyProductKey(std::string productKey)
    {
        if ((productKey != nullptr) && (productKey.trim().length() > 0))
        {
            // Remove styling.
            String cleanedProductKey;
            if (this->getProductKeyStylingWorker() != nullptr)
            {
                cleanedProductKey = StringUtils::toUpper(this->getProductKeyStylingWorker()->removeStyling(productKey));
            }
            else
            {
                cleanedProductKey = StringUtils::toUpper(productKey);
            }
            // Verify that the format of the product-key is valid.
            if ((this->getChecksumWorker() != nullptr) && (!this->getChecksumWorker()->verifyProductKeyChecksum(cleanedProductKey)))
            {
                return ProductKeyState::KEY_INVALID;
            }
            // Test against blacklist.
            if ((this->getBlacklistWorker() != nullptr) && this->getBlacklistWorker()->isKeyBlackListed(cleanedProductKey))
            {
                return ProductKeyState::KEY_BLACKLISTED;
            }
            // If the product-key section bytes are present and valid in length, then verify the
            // product-key sections.
            if ((this->productKeyEncodingData != nullptr) && (this->productKeyEncodingData.size() > 0))
            {
                if (this->getProductKeySectionWorker() != nullptr)
                {
                    try
                    {
                        // Extract the seed from the product-key.
                        long seed = long long.parseLong(cleanedProductKey.substr(0,this->getSeedCharLength()),16);
                        int currentKeyCharIndex = this->getSeedCharLength();
                        std::string tmpKeySection;
                        for (int n = 0; n < this->productKeyEncodingData.size(); n++)
                        {
                            // If the first byte of the current section is zero (0), then skip
                            // validating
                            // this section.
                            if (this->productKeyEncodingData[n] != nullptr)
                            {
                                tmpKeySection = cleanedProductKey.substr(currentKeyCharIndex,currentKeyCharIndex + 2);
                                if (!(tmpKeySection.compare(ProductKeyUtils::buildHexStr(2, this->getProductKeySectionWorker()->buildProductKeySection(seed, this->productKeyEncodingData[n]))) != 0))
                                {
                                    return ProductKeyState::KEY_PHONY;
                                }
                            }
                            currentKeyCharIndex += 2;
                        }
                        // If we get this far, then it means the key is either good, or was made
                        // with a keygen derived from "this" release.
                        return ProductKeyState::KEY_GOOD;
                    }catch (NumberFormatException nfe)
                    {
                    }
                }
            }
        }
        return ProductKeyState::KEY_PHONY;
    }
    std::string generateProductKey(long seed) throws ProductKeyGenerationException
            {
                    // Build the HEXADECIMAL string representing the seed.
                    std::string seedHex = ProductKeyUtils::buildHexStr(this->getSeedCharLength(), seed);
            try
            {
                // Try to parse the HEXADECIMAL string representing the seed and use that for the seed.
                seed = long long.parseLong(seedHex,16);
                if ((this->productKeyEncodingData != nullptr) && (this->productKeyEncodingData.size() > 0))
                {
                    if (this->getProductKeySectionWorker() != nullptr)
                    {
                        std::string keySb = "";
                        seedHex = ProductKeyUtils::buildHexStr(this->getSeedCharLength(), seed);
                        if ((this->getBlacklistWorker() != nullptr) && (this->getBlacklistWorker()->isSeedBlackListed(seedHex)))
                        {
                            throw std::logic_error("SeedIsBlacklistedException");
                        }
                        if ((this->getSeedAvailabilityWorker() != nullptr) && (!this->getSeedAvailabilityWorker()->isSeedAvailable(seedHex)))
                        {
                            throw std::logic_error("SeedAlreadyTakenException");
                        }
                        // The key string begins with a HEXADECIMAL string of the seed.
                        keySb = keySb + seedHex;
                        // Build the byte for the key-section derived from the seed.
                        for (int n = 0; n < this->productKeyEncodingData.size(); n++)
                        {
                            if (this->productKeyEncodingData[n] == nullptr)
                            {
                                throw std::logic_error("EncodingDataNotCompleteException");
                            }
                            keySb = keySb + (ProductKeyUtils::buildHexStr(2, this->getProductKeySectionWorker()->buildProductKeySection(seed, this->productKeyEncodingData[n])));
                        }
                        // Add checksum to key string.
                        if (this->getChecksumWorker() != nullptr)
                        {
                            keySb = keySb + this->getChecksumWorker()->buildProductKeyChecksum(keySb.toString());
                        }
                        // Add dashes to the product-key and return it.
                        if (this->getProductKeyStylingWorker() != nullptr)
                        {
                            return this->getProductKeyStylingWorker()->addStyling(keySb.toString());
                        }
                        return keySb;
                    }
                    else
                    {
                        throw std::logic_error("ProductKeyEncoderNotDefinedException");
                    }
                }
                else
                {
                    throw std::logic_error("EncodingDataNotCompleteException");
                }
            }catch (NumberFormatException nfe)
            {
                throw std::logic_error("InvalidSeedException");
            }
            }
};