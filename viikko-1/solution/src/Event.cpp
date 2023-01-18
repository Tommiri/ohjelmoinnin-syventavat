//
// Created by Tommi Riiheläinen on 15.1.2023.
//

#include "../include/Event.h"

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
