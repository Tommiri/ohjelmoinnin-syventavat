#pragma once

class Volume
{
public:
    // Constructors & destructor
    Volume(const int &aVolume, const bool &aClamping);
    Volume(): volume(defaultValue), clamping(false){};
    ~Volume() = default;

    // Volume methods
    int getVolume() const;
    void setVolume(const int& aVolume);

    // Clamping methods
    bool isClamping() const;
    void setClamping(const bool &aClamping);

private:
    static const int defaultValue{0};
    static const int minValue{0};
    static const int maxValue{100};
    int volume{};
    bool clamping{};
};
