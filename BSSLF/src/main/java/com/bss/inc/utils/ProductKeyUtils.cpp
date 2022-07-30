#include <iostream>
#include <string>
#include <vector>
#include "com_bss_inc_utils_ProductKeyUtils.h"
#include <cstring>
#include "ProductKeyUtilsImpl.h"


jstring str2jstring(JNIEnv* env,const char* pat)
{
   //Define the java String class strClass
    jclass strClass = (env)->FindClass("Ljava/lang/String;");
   //Get the constructor of String(byte[],String) to convert the local byte[] array into a new String
    jmethodID ctorID = (env)->GetMethodID(strClass, "<init>", "([BLjava/lang/String;)V");
   //Create byte array
    jbyteArray bytes = (env)->NewByteArray(strlen(pat));
   //Convert char* to byte array
    (env)->SetByteArrayRegion(bytes, 0, strlen(pat), (jbyte*)pat);
   //Set the String, save the language type, used for the parameters when the byte array is converted to String
    jstring encoding = (env)->NewStringUTF("GB2312");
   //Convert the byte array to java String and output
    return (jstring)(env)->NewObject(strClass, ctorID, bytes, encoding);
}

JNIEXPORT jstring JNICALL Java_com_bss_inc_utils_ProductKeyUtils_buildHexStr(JNIEnv* env, jobject obj, jint explength, jlong content) {
    const char *hex = bhs(explength, content).c_str();
    return str2jstring(env, hex);
}

