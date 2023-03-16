namespace Countries;

public class Country
{
    public string Code; // ISO 3166-1 country code
    public string Name;
    public int Area; // km^2
    public int Population;

    public double PopulationDensity => Population / Area; // Persons per km^2


    public Country(string code, string name, int area, int population)
    {
        Code = code;
        Name = name;
        Area = area;
        Population = population;
    }

    public override string ToString()
    {
        return Name;
    }
}