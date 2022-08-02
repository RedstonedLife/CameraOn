#include <iostream>
#include <vector>
#include <jni.h>
#include "ProductKeyEncodingData.h"

ProductKeyEncodingData::ProductKeyEncodingData(int a, int b, int c) {
    setInts(a,b,c);
}

void ProductKeyEncodingData::setInts(int a_int, int b_int, int c_int) {
    a = a_int;
    b = b_int;
    c = c_int;
}

