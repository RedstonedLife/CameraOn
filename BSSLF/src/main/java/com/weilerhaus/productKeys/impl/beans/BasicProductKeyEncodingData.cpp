#include <iostream>
#include <vector>
#include <jni.h>
#include "BasicProductKeyEncodingData.h"

BasicProductKeyEncodingData::BasicProductKeyEncodingData(int a, int b, int c) {
    setInts(a,b,c);
}

void BasicProductKeyEncodingData::setInts(int a_int, int b_int, int c_int) {
    a = a_int;
    b = b_int;
    c = c_int;
}

