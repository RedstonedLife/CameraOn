#include "ProductKeyEncodingData.h"
#include "ProductKeyState.h"
#include "ProductKeyGenerationException.h"
#include "ProductKeySectionWorker.h"
#include "ChecksumWorker.h"
#include "BlacklistWorker.h"
#include "ProductKeyStylingWorker.h"
#include "SeedAvailabilityWorker.h"
#include <vector>
#include <iostream>
#include <string>
#include <exception>
#ifndef PRODUCTKEYGENERATOR_H
#define PRODUCTKEYGENERATOR_H
namespace KeyGenerator {
    class ProductKeyGenerator {
    private:
        int seedCharLength;
        std::vector<BasicProductKeyEncodingData *> productKeyEncodingData;
        ProductKeySectionWorker *productKeySectionWorker = nullptr;
        ChecksumWorker *checksumWorker = nullptr;
        BlacklistWorker *blacklistWorker = nullptr;
        ProductKeyStylingWorker *productKeyStylingWorker = nullptr;
        SeedAvailabilityWorker *seedAvailabilityWorker = nullptr;
    public:
        ProductKeyGenerator(int seedCharLength,BasicProductKeyEncodingData... productKeyEncodingData) {
            this->seedCharLength = ((((seedCharLength > 0) && (seedCharLength <= 15))) ? seedCharLength : 10);
            if (productKeyEncodingData.size() > 0) {
                this->productKeyEncodingData = productKeyEncodingData;
            }
        }

        int getSeedCharLength() {
            return this->seedCharLength;
        }

        ProductKeyState verifyProductKey(std::string productKey) {
            if (!productKey.empty()) {
                if (StringUtils::trim(productKey).length() > 0) {
                    // Remove styling.
                    std::string cleanedProductKey;
                    if (this->getProductKeyStylingWorker() != nullptr) {
                        cleanedProductKey = StringUtils::toUpper(
                                this->getProductKeyStylingWorker()->removeStyling(productKey));
                    } else {
                        cleanedProductKey = StringUtils::toUpper(productKey);
                    }
                    // Verify that the format of the product-key is valid.
                    if ((this->getChecksumWorker() != nullptr) &&
                        (!this->getChecksumWorker()->verifyProductKeyChecksum(cleanedProductKey))) {
                        return ProductKeyState::KEY_INVALID;
                    }
                    // Test against blacklist.
                    if ((this->getBlacklistWorker() != nullptr) &&
                        this->getBlacklistWorker()->isKeyBlackListed(cleanedProductKey)) {
                        return ProductKeyState::KEY_BLACKLISTED;
                    }
                    // If the product-key section bytes are present and valid in length, then verify the
                    // product-key sections.
                    if (this->productKeyEncodingData.size() > 0) {
                        if (this->getProductKeySectionWorker() != nullptr) {
                            try {
                                // Extract the seed from the product-key.
                                long seed = long.parseLong(cleanedProductKey.substr(0, this->getSeedCharLength()),
                                                                16);
                                int currentKeyCharIndex = this->getSeedCharLength();
                                std::string tmpKeySection;
                                for (int n = 0; n < this->productKeyEncodingData.size(); n++) {
                                    // If the first byte of the current section is zero (0), then skip
                                    // validating
                                    // this section.
                                    if (this->productKeyEncodingData[n] != nullptr) {
                                        tmpKeySection = cleanedProductKey.substr(currentKeyCharIndex,
                                                                                 currentKeyCharIndex + 2);
                                        if (!(tmpKeySection.compare(ProductKeyUtils::buildHexStr(2,
                                                                                                    this->getProductKeySectionWorker()->buildProductKeySection(
                                                                                                            seed,
                                                                                                            this->productKeyEncodingData[n]))) !=
                                              0)) {
                                            return ProductKeyState::KEY_PHONY;
                                        }
                                    }
                                    currentKeyCharIndex += 2;
                                }
                                // If we get this far, then it means the key is either good, or was made
                                // with a keygen derived from "this" release.
                                return ProductKeyState::KEY_GOOD;
                            } catch (NumberFormatException nfe) {
                            }
                        }
                    }
                }
            }
            return ProductKeyState::KEY_PHONY;
        };

        std::string generateProductKey(long seed) {
                        // Build the HEXADECIMAL string representing the seed.
                        std::string seedHex = ProductKeyUtils::buildHexStr(this->getSeedCharLength(), seed);
                try
                {
                    // Try to parse the HEXADECIMAL string representing the seed and use that for the seed.
                    seed = long.parseLong(seedHex, 16);
                    if ((this->productKeyEncodingData != nullptr) && (this->productKeyEncodingData.size() > 0)) {
                        if (this->getProductKeySectionWorker() != nullptr) {
                            std::string keySb = "";
                            seedHex = ProductKeyUtils::buildHexStr(this->getSeedCharLength(), seed);
                            if ((this->getBlacklistWorker() != nullptr) &&
                                (this->getBlacklistWorker()->isSeedBlackListed(seedHex))) {
                                throw std::logic_error("SeedIsBlacklistedException");
                            }
                            if ((this->getSeedAvailabilityWorker() != nullptr) &&
                                (!this->getSeedAvailabilityWorker()->isSeedAvailable(seedHex))) {
                                throw std::logic_error("SeedAlreadyTakenException");
                            }
                            // The key string begins with a HEXADECIMAL string of the seed.
                            keySb = keySb + seedHex;
                            // Build the byte for the key-section derived from the seed.
                            for (int n = 0; n < this->productKeyEncodingData.size(); n++) {
                                if (this->productKeyEncodingData[n] == nullptr) {
                                    throw std::logic_error("EncodingDataNotCompleteException");
                                }
                                keySb = keySb + (ProductKeyUtils::buildHexStr(2,
                                                                                 this->getProductKeySectionWorker()->buildProductKeySection(
                                                                                         seed,
                                                                                         this->productKeyEncodingData[n])));
                            }
                            // Add checksum to key string.
                            if (this->getChecksumWorker() != nullptr) {
                                keySb = keySb + this->getChecksumWorker()->buildProductKeyChecksum(keySb);
                            }
                            // Add dashes to the product-key and return it.
                            if (this->getProductKeyStylingWorker() != nullptr) {
                                return this->getProductKeyStylingWorker()->addStyling(keySb);
                            }
                            return keySb;
                        } else {
                            throw std::logic_error("ProductKeyEncoderNotDefinedException");
                        }
                    } else {
                        throw std::logic_error("EncodingDataNotCompleteException");
                    }
                }catch (NumberFormatException nfe)
                {
                    throw std::logic_error("InvalidSeedException");
                }
        };
        ProductKeySectionWorker* buildProductKeySectionWorker()
        {
            return new BasicProductKeySectionWorker();
        }
        ChecksumWorker* buildChecksumWorker()
        {
            return new BasicChecksumWorker();
        }
        BlacklistWorker* buildBlacklistWorker()
        {
            return nullptr;
        }
        ProductKeyStylingWorker* buildProductKeyStylingWorker()
        {
            return new BasicProductKeyStylingWorker();
        }
        SeedAvailabilityWorker* buildSeedAvailabilityWorker()
        {
            return nullptr;
        }

    private:
        ProductKeySectionWorker *getProductKeySectionWorker() {
            if (this->productKeySectionWorker == nullptr) {
                this->productKeySectionWorker = this->buildProductKeySectionWorker();
            }
            return this->productKeySectionWorker;
        }

        ChecksumWorker *getChecksumWorker() {
            if (this->checksumWorker == nullptr) {
                this->checksumWorker = this->buildChecksumWorker();
            }
            return this->checksumWorker;
        }

        BlacklistWorker *getBlacklistWorker() {
            if (this->blacklistWorker == nullptr) {
                this->blacklistWorker = this->buildBlacklistWorker();
            }
            return this->blacklistWorker;
        }

        ProductKeyStylingWorker *getProductKeyStylingWorker() {
            if (this->productKeyStylingWorker == nullptr) {
                this->productKeyStylingWorker = this->buildProductKeyStylingWorker();
            }
            return this->productKeyStylingWorker;
        }

        SeedAvailabilityWorker *getSeedAvailabilityWorker() {
            if (this->seedAvailabilityWorker == nullptr) {
                this->seedAvailabilityWorker = this->buildSeedAvailabilityWorker();
            }
            return this->seedAvailabilityWorker;
        }
    };
}

#endif //PRODUCTKEYGENERATOR_H
