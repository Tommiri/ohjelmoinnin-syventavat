using System.Globalization;

namespace harj_19;

class Program
{
    private static void Main()
    {
        var helsinki = new City("Helsinki", new Coordinates(60.1708, 24.937));
        var berlin = new City("Berlin", new Coordinates(52.5167, 13.3833));
        var amsterdam = new City("Amsterdam", new Coordinates(52.3731, 4.8922));

        Console.WriteLine(helsinki);
        Console.WriteLine(berlin);
        Console.WriteLine(amsterdam);
    }
}