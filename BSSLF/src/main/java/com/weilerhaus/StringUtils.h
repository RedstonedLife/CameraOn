#include <iostream>
#include <string>
#include <algorithm>
#ifndef STRINGUTILS_H
#define STRINGUTILS_H

const std::string WHITESPACE = " \n\r\t\f\v";
class StringUtils {
    public:
        std::string ltrim(const std::string &s);
        std::string rtrim(const std::string &s);
        std::string trim(const std::string &s);
};
#endif
