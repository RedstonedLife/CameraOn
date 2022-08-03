#include <string>
#include <iostream>
#include "ProductKeySectionWorker.h"

#ifndef BASICPRODUCTKEYSECTIONWORKER_H
#define BASICPRODUCTKEYSECTIONWORKER_H

class BasicProductKeySectionWorker : public ProductKeySectionWorker {
    int buildProductKeySection(long seed, BasicProductKeyEncodingData &encodingData) {
        int a = (int)(((int)encodingData->getA()) % 25);
        int b = (int)(((int)encodingData->getB()) % 3);
        if(((int)a) % == 0) {
            return (int)(((seed >> a) & 255) ^ ((seed >> b) | encodingData->getC()));
        } else {
            return (int)(((seed >> a) & 255) ^ ((seed >> b) & encodingData->getC()));
        }
    }
};

#endif //BASICPRODUCTKEYSECTIONWORKER_H
