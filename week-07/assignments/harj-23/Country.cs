namespace harj_23;

public class Country
{
    public Country(string code, City capital, string name, double area, int population)
    {
        Code = code;
        Capital = capital;
        Name = name;
        Area = area;
        Population = population;
    }

    private string _code;
    public string Code
    {
        get => _code;
        set
        {
            if (value.Length == 2 && value.All(char.IsUpper))
            {
                _code = value;
            }
            else
            {
                throw new ArgumentOutOfRangeException(
                    "Code",
                    "Must be two (2) characters long and in uppercase"
                );
            }

        }
    }

    private string _name;
    public string Name
    {
        get => _name;
        set
        {
            if (!string.IsNullOrEmpty(value))
            {
                _name = value;
            }
            else
            {
                throw new ArgumentNullException(
                    "Name",
                    "Must have a value"
                    );
            }
        }
    }

    private City _capital;

    public City Capital
    {
        get => _capital;
        set => _capital = value;
    }

    private double _area;
    public double Area
    {
        get => _area;
        set
        {
            if (value > 0)
            {
                _area = value;
            }
            else
            {
                throw new ArgumentOutOfRangeException(
                    "Area",
                    "Must have a positive value"
                );
            }
        }
    }

    private int _population;

    public int Population
    {
        get => _population;
        set
        {
            if (value > 0)
            {
                _population = value;
            }
            else
            {
                throw new ArgumentOutOfRangeException(
                    "Population",
                    "Must have a positive value"
                );
            }
        }
    }

    public double PopulationDensity => Population / Area; // Persons per km^2



    public override string ToString()
    {
        return $"{Code} {Name}";
    }
}