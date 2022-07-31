#include <string>

using namespace std;

class EncodingDataNoteCompleteException : public exception {
public:
    string message() {
        return "Encoding-data must be complete for generating product-keys.";
    }
};
