#include <string>
#include <iostream>
#ifndef PRODUCTKEYGENERATIONEXCEPTION_H
#define PRODUCTKEYGENERATIONEXCEPTION_H
class ProductKeyGenerationException : public std::exception {
private:
    static long serialVersionUID;
    std::string detailedMsg
public:
    ProductKeyGenerationException(std::string detailedMessage);
    std::string detailedMessage() {return detailedMsg;}
    void setMessage();
};
#endif
