#include <iostream>
#include <vector>
#include <jni.h>

class BasicProductKeyEncodingData
{
    private:
    int a;
    int b;
    int c;
    public :
    BasicProductKeyEncodingData(int a, int b, int c)
    {
        this->a = a;
        this->b = b;
        this->c = c;
    }
    int getA(){return this->a;}
    int getB(){return this->b;}
    int getC(){return this->c;}
};