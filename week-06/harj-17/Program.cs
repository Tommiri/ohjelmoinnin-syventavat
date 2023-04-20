namespace harj_17;

class Program
{
    private static void Main()
    {
        var helsinki = new Coordinates
        {
            Latitude = 60.1708,
            Longitude = 24.9375
        };

        var berlin = new Coordinates
        {
            Latitude = 52.5167,
            Longitude = 13.3833
        };

        var amsterdam = new Coordinates
        {
            Latitude = 52.3731,
            Longitude = 4.8922
        };

        Console.WriteLine("The distance from Helsinki to Berlin is roughly " + Math.Round(helsinki.DistanceTo(berlin)) +
                          " kilometers.");
        Console.WriteLine("The distance from Helsinki to Amsterdam is roughly " +
                          Math.Round(helsinki.DistanceTo(amsterdam)) + " kilometers.");
    }
}