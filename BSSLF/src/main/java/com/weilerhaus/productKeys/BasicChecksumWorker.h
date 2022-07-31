#ifndef BASICCHECKSUMWORKER_H
#define BASICCHECKSUMWORKER_H

class BasicChecksumWorker {
public:
    std::string buildProductKeyChecksum(std::string productKey);
    bool verifyProductKeyChecksum(std::string productKey);
};

#endif
