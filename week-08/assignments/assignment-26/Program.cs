namespace assignment_26;

public class Program
{
    private static void Main()
    {
        var countries = CountryManager.Instance.Countries;
        var allEvents = new List<CountryEvent>();

        foreach (var country in countries)
        {
            var joined = new CountryEvent
            {
                Kind = EventKind.Joined,
                Code = country.Code,
                Date = country.Joined
            };
            allEvents.Add(joined);

            if (country.Euro.HasValue)
            {
                var euro = new CountryEvent
                {
                    Kind = EventKind.Euro,
                    Code = country.Code,
                    Date = country.Euro ?? default(DateOnly)
                };
                allEvents.Add(euro);
            }

            if (country.Schengen.HasValue)
            {
                var schengen = new CountryEvent
                {
                    Kind = EventKind.Schengen,
                    Code = country.Code,
                    Date = country.Schengen ?? default(DateOnly)
                };
                allEvents.Add(schengen);
            }

            if (country.Exited.HasValue)
            {
                var exited = new CountryEvent
                {
                    Kind = EventKind.Exited,
                    Code = country.Code,
                    Date = country.Exited ?? default(DateOnly)
                };
                allEvents.Add(exited);
            }
        }

        var eventsGroupedByDate = allEvents.OrderByDescending(c => c.Date).GroupBy(e => e.Date);

        Console.WriteLine("\nAll events in the history of the EU");
        Console.WriteLine("------------------------------------");
        Console.WriteLine($"Number of events: {allEvents.Count}\n");
        foreach (var group in eventsGroupedByDate)
        {
            Console.WriteLine($"Events on {group.Key}");
            foreach (var e in group)
            {
                Console.WriteLine($"\t* {CountryManager.Instance.GetCountryByCode(e.Code)?.Name} {e.Kind}");
            }
        }
    }
}