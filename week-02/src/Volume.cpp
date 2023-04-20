#include "../include/Volume.h"
#include <stdexcept>
#include <string>

Volume::Volume(const int &aVolume, const bool &aClamping)
{
    setVolume(aVolume);
    setClamping(aClamping);
}

int Volume::getVolume() const
{
    return volume;
}

void Volume::setVolume(const int &aVolume)
{
    if(aVolume < minValue || aVolume > maxValue) {
        // If clamping == true, no need to throw exception.
        if (!clamping)
        {
            std::string errorString{"Volume must be between " + std::to_string(minValue) + " and " + std::to_string(maxValue)};
            throw std::invalid_argument(errorString);
        }

        // If aVolume < 0, assign volume to 0. Otherwise, aVolume has to be >100 so assign volume to 100.
        volume = aVolume < minValue ? minValue : maxValue;
        return;
    }

    volume = aVolume;
}

bool Volume::isClamping() const
{
    return clamping;
}

void Volume::setClamping(const bool &aClamping)
{
    clamping = aClamping;
}
