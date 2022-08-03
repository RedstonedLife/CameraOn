#include <string>

using namespace std;

class ProductKeyGenerationException : public exception {
public:
    std::string message() {
        return "Failed to generate a product-key.";
    }
};

