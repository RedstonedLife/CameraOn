#include <string>
#include "ChecksumWorker.h"
#include "ProductKeyUtils.h"
#include "StringUtils.h"

#ifndef BASICCHECKSUMWORKER_H
#define BASICCHECKSUMWORKER_H

class BasicChecksumWorker : public ChecksumWorker {
public:
    std::string buildProductKeyChecksum(std::string productKey) {
        if (!productKey.empty()) {
            if (StringUtils::trim(productKey).length() > 0) {
                productKey = StringUtils::trim(productKey);
                int left = 86;
                int right = 175;
                for (int n = 0; n < productKey.length(); n++) {
                    right = right + (int) productKey[n];
                    if (right > 255) { right -= 255; }
                    left += right;
                    if (left > 255) { left -= 255; }
                }
                return ProductKeyUtils::buildHexStr(4, (left << 8) + right);
            }
        }
        return nullptr;
    };
    bool verifyProductKeyChecksum(std::string productKey)
    {
        if (!productKey.empty()){
            if (StringUtils::trim(productKey).length() > 0) {
                productKey = StringUtils::trim(productKey);
                if (productKey.length() > 4) {
                    // Extract the last four characters as they are the checksum.
                    std::string checkSum = productKey.substr(productKey.length() - 4);
                    productKey = productKey.substr(0,productKey.length() - 4);
                    // Compare the extracted checksum against the generated checksum for the key string.
                    return (checkSum.compare(buildProductKeyChecksum(productKey)) != 0);
                }
            }
        }
        return false;
    };
};

#endif //BASICCHECKSUMWORKER_H
