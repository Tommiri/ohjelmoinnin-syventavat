//
// Created by Tommi Riiheläinen on 15.1.2023.
//
#include <iostream>

#include "../include/Event.h"

using std::cout, std::endl;

Event::Event(const string &aTimestamp, const string &aCategory, const string &aDescription)
{
    setTimestamp(aTimestamp);
    setCategory(aCategory);
    setDescription(aDescription);
}

void Event::setTimestamp(const string &aTimestamp)
{
    timestamp = aTimestamp;
}

string Event::getTimestamp() const
{
    return timestamp;
}

void Event::setCategory(const string &aCategory)
{
    category = aCategory;
}

string Event::getCategory() const
{
    return category;
}

void Event::setDescription(const string &aDescription)
{
    description = aDescription;
}

string Event::getDescription() const
{
    return description;
}

void Event::printEvent() const
{
    cout << "Date: " << timestamp << endl;
    cout << "Category: " << category << endl;
    cout << "Description: " << description << endl;
}
