#include "ProductKeySectionWorker.h"
#ifndef PRODUCTKEYENCODINGDATA_H
#define PRODUCTKEYENCODINGDATA_H

class ProductKeyEncodingData {
    private:
    int a;
    int b;
    int c;
    friend int ProductKeySectionWorker::buildProductKeySection(long seed, ProductKeyEncodingData& encodingData);
    public:
    ProductKeyEncodingData(int a, int b, int c);
    void setInts(int a, int b, int c);
    int getA() {return a;}
    int getB() {return b;}
    int getC() {return c;}
};

#endif
