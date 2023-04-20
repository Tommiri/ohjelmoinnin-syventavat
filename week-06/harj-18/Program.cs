namespace harj_18;

class Program
{
    private static void Main()
    {
        var helsinki = new Coordinates(60.1708, 24.937);
        var berlin = new Coordinates(52.5167, 13.3833);
        var amsterdam = new Coordinates(52.3731, 4.8922);

        Console.WriteLine("The distance from Helsinki to Berlin is roughly " + Math.Round(helsinki.DistanceTo(berlin)) +
                          " kilometers.");
        Console.WriteLine("The distance from Helsinki to Amsterdam is roughly " +
                          Math.Round(helsinki.DistanceTo(amsterdam)) + " kilometers.");
    }
}