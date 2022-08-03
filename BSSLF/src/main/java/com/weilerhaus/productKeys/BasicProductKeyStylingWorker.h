#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include "ProductKeyStylingWorker.h"
#include "StringUtils.h"

#ifndef BASICPRODUCTKEYSTYLINGWORKER_H
#define BASICPRODUCTKEYSTYLINGWORKER_H

class BasicProductKeyStylingWorker : public ProductKeyStylingWorker {
public:
    std::string addStyling(std::string productKey) {
        if(!productKey.empty()) {
            if(StringUtils::trim(productKey).length() > 0) {
                std::string const streamString = StringUtils::toUpper(StringUtils::trim(productKey));
                int tmpCharsSinceDash = 0;
                for(int n = (streamString.length() -1); n >= 0; n--) {
                    if(n >= 5) {
                        if(tmpCharsSinceDash>=5) {
                            streamString.insert(n, '-');
                            tmpCharsSinceDash=0;
                        } else {tmpCharsSinceDash++;}} else {break;}
                }
                return streamString;
            }
        }
        return productKey;
    };
    std::string removeStyling(std::string productKey) {
        if(!productKey.empty()) {
            if(StringUtils::trim(productKey).length() > 0) {
                return productKey.replace('-','\0');
            }
        }
        return productKey;
    };
};

#endif //BASICPRODUCTKEYSTYLINGWORKER_H
