#ifndef SOLUTION_EVENT_H
#define SOLUTION_EVENT_H

#include <string>

using std::string;

class Event
{
public:
    Event(const string &aTimestamp, const string &aCategory, const string &aDescription);
    ~Event() = default;
    void setTimestamp(const string &aTimestamp);
    string getTimestamp() const;
    void setCategory(const string &aCategory);
    string getCategory() const;
    void setDescription(const string &aDescription);
    string getDescription() const;
private:
    string timestamp;
    string category;
    string description;
};


#endif //SOLUTION_EVENT_H
