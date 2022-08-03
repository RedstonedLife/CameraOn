#include "ProductKeyUtils.h"
#include <iostream>
#include <memory>
#include <string>
#include <stdexcept>
#include <vector>
#include <jni.h>

using namespace std;

template<typename ... Args>
std::string string_format( const std::string& format, Args ... args )
{
    int size_s = std::snprintf( nullptr, 0, format.c_str(), args ... ) + 1; // Extra space for '\0'
    if( size_s <= 0 ){ throw std::runtime_error( "Error during formatting." ); }
    auto size = static_cast<size_t>( size_s );
    std::unique_ptr<char[]> buf( new char[ size ] );
    std::snprintf( buf.get(), size, format.c_str(), args ... );
    return std::string( buf.get(), buf.get() + size - 1 ); // We don't want the '\0' inside
}

std::string buildHexStr(int expectedLength, long content)
{
        std::string pZ = "%0";
        std::string xS = "X";
        std::string result = pZ + to_string(expectedLength).c_str() + xS;
        std::string hexStr = string_format(result.c_str(), content);
        if (hexStr.length() > expectedLength)
        {
            hexStr = hexStr.substr(hexStr.length() - expectedLength);
        }
        while (hexStr.length() < expectedLength)
        {
            hexStr =+ "0";
        }
        return hexStr;
}