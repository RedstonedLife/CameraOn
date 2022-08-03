#include "ProductKeySectionWorker.h"
#include "ChecksumWorker.h"
#include "BlacklistWorker.h"
#include "ProductKeyStylingWorker.h"
#include "SeedAvailabilityWorker.h"

#ifndef BASICPRODUCTKEYGENERATOR_H
#define BASICPRODUCTKEYGENERATOR_H

class BasicProductKeyGenerator : public ProductKeyGenerator
{
public :
    BasicProductKeyGenerator(params ProductKeyEncodingData[] productKeyEncodingData)
    {
    }
    // PROTECTED METHDOS
protected:
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
};

#endif BASICPRODUCTKEYGENERATOR_H
