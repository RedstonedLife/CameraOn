#include <iostream>
#include <string>
#include <vector>
#include "com_bss_inc_utils_ProductKeyUtils.h"
#include "ProductKeyUtilsImpl.h"

#define ENV (*env)

JNIEXPORT jstring JNICALL Java_com_bss_inc_utils_ProductKeyUtils_buildHexStr(JNIEnv ENV, jobject obj, jint explength, jlong content) {
    return JNIEnv::NewStringUTF(bhs(explength, content));
}
