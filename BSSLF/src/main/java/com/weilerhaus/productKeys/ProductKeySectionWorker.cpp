#include <string>
#include <iostream>
#include "ProductKeySectionWorker.h"

int BasicProductKeySectionWorker::buildProductKeySection(long seed, BasicProductKeyEncodingData &encodingData) {
    int a = (int)(((int)encodingData->getA()) % 25);
    int b = (int)(((int)encodingData->getB()) % 3);
    if(((int)a) % == 0) {
        return (int)(((seed >> a) & 255) ^ ((seed >> b) | encodingData->getC()));
    } else {
        return (int)(((seed >> a) & 255) ^ ((seed >> b) & encodingData->getC()));
    }
}
