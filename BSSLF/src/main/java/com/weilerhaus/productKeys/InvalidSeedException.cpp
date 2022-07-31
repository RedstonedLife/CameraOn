#include <string>

using namespace std;

class InvalidSeedException : public exception {
public:
    string message() {
        return "Seed Is Invalid";
    }
};

