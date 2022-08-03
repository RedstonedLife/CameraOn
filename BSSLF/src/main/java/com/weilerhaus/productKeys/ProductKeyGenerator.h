#include "ProductKeyEncodingData.h"
#include "ProductKeyState.h"
#include "ProductKeyGenerationException.h"
#include "ProductKeySectionWorker.h"
#include "ChecksumWorker.h"
#include "BlacklistWorker.h"
#include "ProductKeyStylingWorker.h"
#include "SeedAvailabilityWorker.h"


#ifndef PRODUCTKEYGENERATOR_H
#define PRODUCTKEYGENERATOR_H

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
public:
    public ProductKeyGenerator(int seedCharLength, params ED[] productKeyEncodingData);
    int getSeedCharLength();
    void setSeedCharLength(int in);
    ProductKeyState* verifyProductKey(std::string productKey);
    std::string generateProductKey(long seed) throws ProductKeyGenerationException;
protected:
    virtual ProductKeySectionWorker* buildProductKeySectionWorker() = 0;
    virtual ChecksumWorker* buildChecksumWorker() = 0;
    virtual BlacklistWorker* buildBlacklistWorker() = 0;
    virtual ProductKeyStylingWorker* buildProductKeyStylingWorker() = 0;
    virtual SeedAvailabilityWorker* buildSeedAvailabilityWorker() = 0;
private:
    ProductKeySectionWorker* getProductKeySectionWorker() {
        if(this->productKeySectionWorker == nullptr) {
            this->productKeySectionWorker = this->buildProductKeySectionWorker();
        }
        return this->productKeySectionWorker;
    }
    ChecksumWorker* getChecksumWorker() {
        if(this->checksumWorker == nullptr) {
            this->checksumWorker = this->buildChecksumWorker();
        }
        return this->checksumWorker;
    }
    BlacklistWorker* getBlacklistWorker() {
        if(this->blacklistWorker == nullptr) {
            this->blacklistWorker = this->buildBlacklistWorker();
        }
        return this->blacklistWorker;
    }
    ProductKeyStylingWorker* getProductKeyStylingWorker() {
        if(this->productKeyStylingWorker == nullptr) {
            this->productKeyStylingWorker = this->buildProductKeyStylingWorker();
        }
        return this->productKeyStylingWorker;
    }
    SeedAvailabilityWorker* getSeedAvailabilityWorker() {
        if(this->seedAvailabilityWorker == nullptr) {
            this->seedAvailabilityWorker = this->buildSeedAvailabilityWorker();
        }
        return this->seedAvailabilityWorker;
    }
};


#endif //PRODUCTKEYGENERATOR_H
