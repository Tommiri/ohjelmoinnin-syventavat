namespace assignment_25;

public class Program
{
    private static void Main()
    {
        var countries = CountryManager.Instance.Countries;
        
        var date25YearsAgo = DateOnly.FromDateTime(DateTime.Now).AddYears(-25);
        var membersFor25Years = countries.Where(c => c.Joined <= date25YearsAgo && c.IsCurrentMember).OrderByDescending(c => c.Joined);

        Console.WriteLine("\nCountries that joined the EU 25 or more years ago");
        Console.WriteLine("------------------------------------");
        foreach (var country in membersFor25Years)
        {
            Console.WriteLine($"{country.Name}, joined {country.Joined}");
        }

        var euroCountries = countries.Where(c => c.Euro.HasValue).OrderByDescending(c => c.Euro);
        
        Console.WriteLine("\n\nCountries that use Euros as currency");
        Console.WriteLine("------------------------------------");
        foreach (var country in euroCountries)
        {
            Console.WriteLine($"{country.Name}, since {country.Euro}");
        }

        var joinedOnOtherThanFirstJanuary = countries.Where(c => c.Joined.DayOfYear != 1)
            .OrderByDescending(c => c.Joined);
        
        Console.WriteLine("\n\nCountries that joined the EU on a date other than 1st of January");
        Console.WriteLine("------------------------------------");
        foreach (var country in joinedOnOtherThanFirstJanuary)
        {
            Console.WriteLine($"{country.Name}, joined {country.Joined}");
        }

        var schengenCount = countries.Count(c => c.Schengen.HasValue);
        Console.WriteLine($"\n\nNumber of countries in the Schengen Agreement: {schengenCount}");

    }
}

