using System.Text;

namespace assignment_24;

public class Program
{
    private static void Main()
    {
        Console.WriteLine(JoinItems(
            new List<string> { "Crosby", "Stills", "Nash", "Young" },
            ", ",
            " & "));
    }
    
    private static string JoinItems(IEnumerable<string> items, string between, string beforeLast)
    {
        var str = string.Join(between, items);
        var indexToReplace = str.LastIndexOf(between);
        if (indexToReplace <= 0)
        {
            return str;
        }
        var sb = new StringBuilder(str);
        sb.Remove(indexToReplace, between.Length).Insert(indexToReplace, beforeLast);
        return sb.ToString();
    }
}

