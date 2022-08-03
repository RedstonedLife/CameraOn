#include <string>
#ifndef PRODUCTKEYSTYLINGWORKER_H
#define PRODUCTKEYSTYLINGWORKER_H
class ProductKeyStylingWorker {
public:
    virtual std::string addStyling(std::string productKey);
    virtual std::string removeStyling(std::string productKey);
};
#endif
