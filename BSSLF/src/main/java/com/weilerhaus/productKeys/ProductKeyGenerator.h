#include "ProductKeyEncodingData.h"


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
};


#endif //CAMERAON_PRODUCTKEYGENERATOR_H
