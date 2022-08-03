#include <string>

#ifndef SEEDAVAILABILITYWORKER_H
#define SEEDAVAILABILITYWORKER_H

class SeedAvailabilityWorker {
public:
    virtual bool isSeedAvailable(std::string seedHex) = 0;
};

#endif //CAMERAON_SEEDAVAILABILITYWORKER_H
