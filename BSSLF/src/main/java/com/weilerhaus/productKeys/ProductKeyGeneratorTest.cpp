#include <string>
#include <vector>
#include "ProductKeyGeneratorTest.h"

int main(int argc, char **argv){
    std::vector<std::string> parameter(argv + 1, argv + argc);
    ProductKeyGeneratorTest::main(parameter);
    return 0;
};
