#include <iostream>
#include <string>
#include <vector>
#include <../utils/ProductKeyUtilsImpl.h>

class BasicChecksumWorker
{
    public:
    std::string buildProductKeyChecksum(std::string productKey)
    {
        if ((productKey != nullptr) && (productKey.trim().length() > 0))
        {
            productKey = productKey.trim();
            int left = 86;
            int right = 175;
            for (int n = 0; n < productKey.length(); n++)
            {
                right = right + (int)productKey[n];
                if (right > 255)
                {
                    right -= 255;
                }
                left += right;
                if (left > 255)
                {
                    left -= 255;
                }

            }
            return bhs(4, (left << 8) + right);
        }
        return nullptr;
    }
    bool verifyProductKeyChecksum(std::string productKey)
    {
        if ((productKey != nullptr) && (productKey.trim().length() > 0))
        {
            productKey = productKey.trim();
            if (productKey.length() > 4)
            {
                // Extract the last four characters as they are the checksum.
                std::string checkSum = productKey.substr(productKey.length() - 4);
                productKey = productKey.substr(0,productKey.length() - 4);
                // Compare the extracted checksum against the generated checksum for the key string.
                return (checkSum.compare(buildProductKeyChecksum(productKey)) != 0);
            }
        }
        return false;
    }
};