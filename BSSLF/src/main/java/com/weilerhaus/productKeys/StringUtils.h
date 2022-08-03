#include <iostream>
#include <string>
#include <algorithm>
#ifndef STRINGUTILS_H
#define STRINGUTILS_H
class StringUtils {
    public:
        static std::string ltrim(std::string s) {
            size_t start = s.find_first_not_of(" \n\r\t\f\v");
            return (start==std::string::npos) ? "" : s.substr(start);
        };
        static std::string rtrim(std::string s) {
            size_t end = s.find_last_not_of(" \n\r\t\f\v");
            return (end == std::string::npos) ? "" : s.substr(0, end + 1);
        };
        static std::string trim(std::string s) {
            return rtrim(ltrim(s));
        };
        static std::string toUpper(std::string s) {
            std::string result = s;
            std::transform(result.begin(), result.end(), result.begin(), ::toupper);
            return result;
        };
};
#endif
