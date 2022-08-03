#ifndef CHECKSUMWORKER_H
#define CHECKSUMWORKER_H

class ChecksumWorker {
public:
    std::string buildProductKeyChecksum(std::string productKey);
    bool verifyProductKeyChecksum(std::string productKey);
};

#endif
