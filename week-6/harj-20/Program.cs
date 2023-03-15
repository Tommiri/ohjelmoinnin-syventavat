namespace harj_20;

class Program
{
    private static void Main()
    {
        var helsinki = new City("Helsinki", new Coordinates(60.1708, 24.937));
        var berlin = new City("Berlin", new Coordinates(52.5167, 13.3833));
        var amsterdam = new City("Amsterdam", new Coordinates(52.3731, 4.8922));

        City[] cities = { helsinki, berlin, amsterdam };

        var distancesTable = $"{cities[0].Name,20}{cities[1].Name,10}{cities[2].Name,13}\n";

        foreach (var city in cities)
        {
            distancesTable +=
                $"{city.Name,-12}{city.DistanceTo(cities[0]),-12}{city.DistanceTo(cities[1]),-10}{city.DistanceTo(cities[2])}\n";
        }

        Console.WriteLine(distancesTable);
    }
}