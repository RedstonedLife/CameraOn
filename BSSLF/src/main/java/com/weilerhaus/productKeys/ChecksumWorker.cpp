#include <iostream>
#include <string>
#include <vector>
#include "ProductKeyUtils.h"
#include "ChecksumWorker.h"
#include "StringUtils.h"

std::string ChecksumWorker::buildProductKeyChecksum(std::string productKey) {
    if((productKey != nullptr) && (StringUtils::trim(productKey).length() > 0)) {
        productKey = StringUtils::trim(productKey);
        int left = 86;
        int right = 175;
        for(int n=0; n < productKey.length(); n++) {
            right = right + (int)productKey[n];
            if (right > 255) {right -= 255;}
            left += right;
            if (left > 255) {left -= 255;}
        }
        bhs(4, (left << 8) + right);
    }
    return nullptr;
}
bool ChecksumWorker::verifyProductKeyChecksum(std::string productKey) {
    if((productKey != nullptr) && (StringUtils::trim(productKey).length() > 0)) {
        productKey = productKey.trim();
        if (productKey.length() > 4)
        {
            std::string checkSum = productKey.substr(productKey.length() - 4);
            productKey = productKey.substr(0,productKey.length() - 4);
            return (checkSum.compare(buildProductKeyChecksum(productKey)) != 0);
        }
    }
    return false;
}
