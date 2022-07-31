#include <string>

using namespace std;

class SeedAlreadyTakenException : public exception {
public:
    string message() {
        return "Seed is already taken";
    }
};
