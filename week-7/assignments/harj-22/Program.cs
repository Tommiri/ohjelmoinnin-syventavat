namespace harj_22;

public class Program
{
    public static void Main()
    {
        var countries = new Country[5];

        countries[0] = new Country("AT", "Austria", 83_879, 9_027_999);
        countries[1] = new Country("BE", "Belgium", 30_528, 11_584_008);
        countries[2] = new Country("BG", "Bulgaria", 111_002, 6_520_314);
        countries[3] = new Country("CY", "Cyprus", 9_251, 1_244_188);
        countries[4] = new Country("CZ", "Czechia", 78_867, 10_524_167);
        
        Array.ForEach(countries, Console.WriteLine);

        Console.WriteLine($"'countries' length: {countries.Length}\n");

        Console.WriteLine("Adding new country to index 5...");
        countries[5] = new Country("FI", "Finland", 338_435, 5_553_000);
    }
}