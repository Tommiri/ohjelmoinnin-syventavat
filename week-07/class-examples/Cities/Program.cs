namespace Cities;

public class Program
{
    public static void Main()
    {
        try
        {
            var good = new Coordinates(61.50, 23.75);
            Console.WriteLine(good);
            var bad = new Coordinates(2500.45, 179.00);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}