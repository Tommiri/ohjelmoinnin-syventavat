#include <iostream>
#include "../include/Volume.h"

int main()
{
    Volume v1(35, false);
    std::cout << "v1 = " << v1.getVolume() << std::endl;
    Volume v2;
    std::cout << "v2 = " << v2.getVolume() << std::endl;

    try
    {
        v2.setVolume(-1234);
    }
    catch (std::invalid_argument const& ex) {
        std::cerr << "ERROR: Invalid argument - " << ex.what() << std::endl;
    }

    std::cout << "v2 = " << v2.getVolume() << std::endl;

    v2.setClamping(true);
    v2.setVolume(5000);
    std::cout << "v2 = " << v2.getVolume() << std::endl;

    // Output
    /*
        v1 = 35
        v2 = 0
        ERROR: Invalid argument - Volume must be between 0 and 100
        v2 = 0
        v2 = 100
    */

    return 0;
}
