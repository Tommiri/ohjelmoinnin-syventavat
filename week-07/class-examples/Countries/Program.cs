namespace Countries;

public class Program
{
    public static void Main()
    {
        var finland = new Country(
            "FI",
            "Finland",
            338_435,
            5_553_000);

        Console.WriteLine(finland);
        Console.WriteLine($"Area: {finland.Area} sq. km");
        Console.WriteLine($"Population: {finland.Population}");
        Console.WriteLine($"Population density: {finland.PopulationDensity} people / sq. km");
    }
}