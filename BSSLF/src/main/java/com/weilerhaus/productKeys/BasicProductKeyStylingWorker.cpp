#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include "BasicProductKeyStylingWorker.h"
#include "StringUtils.h"

std::string BasicProductKeyStyling::addStyling(std::string productKey) {
    if((productKey != nullptr) && (StringUtils::trim(productKey).length() > 0)) {
        std::stringstream streamString;
        streamString << StringUtils::toUpper(StringUtils::trim(productKey));
    }
}
