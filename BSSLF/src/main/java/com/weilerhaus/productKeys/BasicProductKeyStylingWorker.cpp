#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include "BasicProductKeyStylingWorker.h"
#include "StringUtils.h"

std::string BasicProductKeyStyling::addStyling(std::string productKey) {
    if((productKey != nullptr) && (StringUtils::trim(productKey).length() > 0)) {
        std::string streamString;
        streamString = StringUtils::toUpper(StringUtils::trim(productKey));
        int tmpCharsSinceDash = 0;
        for(int n = (streamString.length() -1); n >= 0; n--) {
            if(n >= 5) {
                if(tmpCharsSinceDash>=5) {
                    streamString.insert(n,'-');
                    tmpCharsSinceDash=0;
                } else {tmpCharsSinceDash++;}} else {break;}
        }
        return streamString;
    }
    return productKey;
}
std::string BasicProductKeyStyling::removeStyling(std::string productKey) {
    if((productKey != nullptr) && (StringUtils::trim(productKey) > 0)) {return productKey.replace('-','');}
    return productKey;
}
