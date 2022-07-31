#include <string>
#ifndef STRINGUTILS_H
#define STRINGUTILS_H
class StringUtils {
    public:
        std::string ltrim(const std::string &s);
        std::string rtrim(const std::string &s);
        std::string trim(const std::string &s);
        std::string toUpper(const std::string &s);
};
#endif
