#include <string>

using namespace std;

class ProductKeyEncoderNotDefinedException : public exception {
public:
    string message() {
        return "Product-key encoder is not defined.";
    }
};

