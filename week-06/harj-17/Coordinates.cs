namespace harj_17;

public class Coordinates
{
    public double Latitude;
    public double Longitude;

    public override string ToString()
    {
        return string.Format("{0},{1}", Latitude, Longitude);
    }

    private static double DegreesToRadians(double degrees)
    {
        return Math.PI / 180 * degrees;
    }

    public double DistanceTo(Coordinates other)
    {
        const double EarthEquatorialRadius = 6378.1370; // km
        var lat1 = DegreesToRadians(Latitude);
        var lon1 = DegreesToRadians(Longitude);
        var lat2 = DegreesToRadians(other.Latitude);
        var lon2 = DegreesToRadians(other.Longitude);
        var dlon = lon2 - lon1;
        var dlat = lat2 - lat1;
        var a = Math.Pow(Math.Sin(dlat / 2), 2)
                + Math.Cos(lat1) * Math.Cos(lat2)
                                 * Math.Pow(Math.Sin(dlon / 2), 2);
        var c = 2 * Math.Atan2(Math.Sqrt(a), Math.Sqrt(1 - a));
        return EarthEquatorialRadius * c;
    }
}