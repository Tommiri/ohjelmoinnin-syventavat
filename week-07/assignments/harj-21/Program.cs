namespace harj_21;

public class Program
{
    public static void Main()
    {
        Country? testCountry = null;
        
        for (var i = 0; i < 4; i++)
        {
            var code = "FI";
            var name = "Finland";
            var area = 338_440.00;
            var population = 5_541_000;

            switch (i)
            {
                case 0:
                    code = "fi";
                    break;
                case 1:
                    name = "";
                    break;
                case 2:
                    area = -123.00;
                    break;
                case 3:
                    population = -123;
                    break;
            }
            
            try
            {
                testCountry = new Country(code, name, area, population);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine($"Country {i+1}: {testCountry}\n"); // Nothing gets printed because exception was thrown and values weren't set
        }
    }
}