#ifndef CHECKSUMWORKER_H
#define CHECKSUMWORKER_H

class ChecksumWorker {
public:
    virtual std::string buildProductKeyChecksum(std::string productKey);
    virtual bool verifyProductKeyChecksum(std::string productKey);
};

#endif
