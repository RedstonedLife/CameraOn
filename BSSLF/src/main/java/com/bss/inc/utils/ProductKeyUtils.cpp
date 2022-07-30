#include <iostream>
#include <string>
#include <vector>
#include "com_bss_inc_utils_ProductKeyUtils.h"

#define ENV (*env)

JNIEXPORT std::jstring JNICALL Java_com_bss_inc_utils_ProductKeyUtils_buildHexStr(JNIEnv *env, jobject obj, jint explength, jlong content) {
	std::string hexStr = String.format("%0" + std::to_string(expectedLength) + "X",content);
    if (hexStr.length() > expectedLength) {hexStr = hexStr.substr(hexStr.length() - expectedLength);}
    while (hexStr.length() < expectedLength){hexStr = "0" + hexStr;}
    return hexStr;
}