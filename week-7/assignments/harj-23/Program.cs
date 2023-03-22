namespace harj_23;

public class Program
{
    public static void Main()
    {
        Country[] countries =
        {
            new("AT", new City("Vienna", new Coordinates(1, 1)), "Austria", 83_879, 9_027_999),
            new("BE", new City("Brussels", new Coordinates(2, 2)), "Belgium", 30_528, 11_584_008),
            new("BG", new City("Sofia", new Coordinates(3, 3)), "Bulgaria", 111_002, 6_520_314),
            new("CY", new City("Nicosia", new Coordinates(4, 4)), "Cyprus", 9_251, 1_244_188),
            new("CZ", new City("Prague", new Coordinates(5, 5)), "Czechia", 78_867, 10_524_167)
        };

        Array.ForEach(countries, Console.WriteLine);

        Console.WriteLine($"'countries' length: {countries.Length}\n");
    }
}