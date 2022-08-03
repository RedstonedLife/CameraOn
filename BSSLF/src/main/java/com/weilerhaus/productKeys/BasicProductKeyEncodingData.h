#include "ProductKeyEncodingData.h"
#include "ProductKeySectionWorker.h"
#ifndef BASICPRODUCTKEYENCODINGDATA_H
#define BASICPRODUCTKEYENCODINGDATA_H

class BasicProductKeyEncodingData {
private:
    int a;
    int b;
    int c;
    friend int ProductKeySectionWorker::buildProductKeySection(long seed, ProductKeyEncodingData& encodingData);
public:
    BasicProductKeyEncodingData(int a, int b, int c) {
        this->a=a;
        this->b=b;
        this->c=c;
    };
    int getA() {return a;}
    int getB() {return b;}
    int getC() {return c;}
};

#endif //BASICPRODUCTKEYENCODINGDATA_H
