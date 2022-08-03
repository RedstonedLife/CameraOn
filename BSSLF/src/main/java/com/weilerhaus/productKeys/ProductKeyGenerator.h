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
    ProductKeyState* verifyProductKey(std::string productKey);
    std::string generateProductKey(long seed) throws ProductKeyGenerationException;
protected:
    virtual ProductKeySectionWorker* buildProductKeySectionWorker() = 0;
    virtual ChecksumWorker* buildChecksumWorker() = 0;
    virtual BlacklistWorker* buildBlacklistWorker() = 0;
    virtual ProductKeyStylingWorker* buildProductKeyStylingWorker() = 0;
    virtual SeedAvailabilityWorker* buildSeedAvailabilityWorker() = 0;
};


#endif //CAMERAON_PRODUCTKEYGENERATOR_H
