#include <string>

using namespace std;

class SeedIsBlacklistedException : public exception {
public:
    string message() {
        return "Seed provided is black-listed.";
    }
};
