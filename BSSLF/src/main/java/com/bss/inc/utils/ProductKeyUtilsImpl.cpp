#include "ProductKeyUtilsImpl.h"
#include <iostream>
#include <string>
#include <format>
#include <vector>
#include <jni.h>

using namespace std;

std::string bhs(int expectedLength, long content)
{
        std::string hexStr = std::format("%0" + std::to_string(expectedLength) + "X", content);
        if (hexStr::length() > expectedLength)
        {
            hexStr = hexStr::substr(hexStr::length() - expectedLength);
        }
        while (hexStr::length() < expectedLength)
        {
            hexStr =+ "0"
        }
        return hexStr;
}