#include <string>

#ifndef BLACKLISTWORKER_H
#define BLACKLISTWORKER_H

class BlacklistWorker {
public:
    virtual bool isKeyBlackListed(std::string productKey) = 0;
    virtual bool isSeedBlackListed(std::string seedHex) = 0;
};

#endif //CAMERAON_BLACKLISTWORKER_H
