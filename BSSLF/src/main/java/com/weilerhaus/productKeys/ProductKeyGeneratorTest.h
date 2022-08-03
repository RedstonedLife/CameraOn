#include "BasicChecksumWorker.h"
#include "BasicProductKeyStylingWorker.h"
#include "BasicProductKeySectionWorker.h"
#include "BasicProductKeyEncodingData.h"
#include "BasicProductKeyGenerator.h"
#include "ProductKeyState.h"
#include <random>


#ifndef PRODUCTKEYGENERATORTEST_H
#define PRODUCTKEYGENERATORTEST_H

class ProductKeyGeneratorTest
{
public:
    static void main(std::vector<std::string> &args)
    {
        std::string tmpKey;
        ProductKeyState* tmpGeneratedKeyState;
        std::vector<std::string> generatedProductKeys(25);
        // @formatter:off
        ProductKeyGenerator* productKeyGenerator = new BasicProductKeyGenerator(new BasicProductKeyEncodingData((int)24, (int)3, (int)101), new BasicProductKeyEncodingData((int)10, (int)4, (int)56), new BasicProductKeyEncodingData((int)1, (int)2, (int)91), new BasicProductKeyEncodingData((int)7, (int)1, (int)100), new BasicProductKeyEncodingData((int)2, (int)36, (int)45), new BasicProductKeyEncodingData((int)13, (int)5, (int)54), new BasicProductKeyEncodingData((int)21, (int)67, (int)25), new BasicProductKeyEncodingData((int)3, (int)76, (int)12), new BasicProductKeyEncodingData((int)31, (int)22, (int)34), new BasicProductKeyEncodingData((int)15, (int)72, (int)65));
        // @formatter:on
        int tmpTryCount;
        std::cout << "**** BUILDING KEYS ****" << std::endl;
        std::default_random_engine generator;
        std::uniform_int_distribution<long> distribution(LONG_MIN, LONG_MAX);
        long result = distribution(generator)
        for (int n = 0; n < 25; n++)
        {
            tmpKey = nullptr;
            tmpTryCount = 0;
            while ((tmpKey == nullptr) && (tmpTryCount < 10))
            {
                try
                {
                    tmpKey = productKeyGenerator->generateProductKey(result);
                }catch (Exception e)
                {
                }
                tmpTryCount++;
            }
            if ((tmpKey != nullptr) && (tmpKey.trim().length() > 0))
            {
                tmpGeneratedKeyState = productKeyGenerator->verifyProductKey(tmpKey);
                if (ProductKeyState::KEY_GOOD == tmpGeneratedKeyState)
                {
                    generatedProductKeys[n] = tmpKey;
                    std::cout << std::to_string((n + 1)) + ") " + ((((n < 9)) ? " " : "")) + "Product Key (GOOD): " + tmpKey << std::endl;
                }
                else
                {
                    std::cout << std::to_string((n + 1)) + ")  " + ((((n < 9)) ? " " : "")) + "Product Key (BAD): " + tmpKey + ":  Key State: " + tmpGeneratedKeyState.name() << std::endl;
                }
            }
            else
            {
                std::cout << "Failed to generate product keys." << std::endl;
                break;
            }
        }
        std::cout << std::endl;
        std::cout << std::endl;
        std::cout << "**** VERIFYING KEYS ****" << std::endl;
        // @formatter:off
        BasicProductKeyGenerator* basicProductKeyGenerator = new BasicProductKeyGenerator(new BasicProductKeyEncodingData((int)24, (int)3, (int)101), nullptr, new BasicProductKeyEncodingData((int)1, (int)2, (int)91), new BasicProductKeyEncodingData((int)7, (int)1, (int)100), nullptr, nullptr, new BasicProductKeyEncodingData((int)21, (int)67, (int)25), nullptr, new BasicProductKeyEncodingData((int)31, (int)22, (int)34), nullptr);
        // @formatter:on
        int keyIndex = 0;
        for (auto productKey : generatedProductKeys)
        {
            if ((productKey != nullptr) && (productKey.trim().length() > 0))
            {
                tmpGeneratedKeyState = basicProductKeyGenerator->verifyProductKey(productKey);
                if (ProductKeyState::KEY_GOOD == tmpGeneratedKeyState)
                {
                    std::cout << std::to_string((keyIndex + 1)) + ") " + ((((keyIndex < 9)) ? " " : "")) + "Product Key (GOOD): " + productKey << std::endl;
                }
                else
                {
                    std::cout << std::to_string((keyIndex + 1)) + ")  " + ((((keyIndex < 9)) ? " " : "")) + "Product Key (BAD): " + productKey + ":  Key State: " + tmpGeneratedKeyState.name() << std::endl;
                }
                keyIndex++;
            }
            else
            {
                std::cout << "Unable to validate empty product key." << std::endl;
            }
        }
    }
};

#endif //PRODUCTKEYGENERATORTEST_H
