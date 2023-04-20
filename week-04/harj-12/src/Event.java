import java.time.LocalDate;
import java.time.Period;

public class Event implements Comparable<Event> {
    public Event(LocalDate date, String category, String description) {
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.date + ": " 
            + this.description
            + " (" + this.category + ")"; 
    }

    // Implement the 'Comparable' interface's compareTo method
    public int compareTo(Event event) {
        if (this.date.isEqual(event.getDate())) {
            return 0;
        }
        // If date is after given event's date return 1, else (is before) return -1
        return this.date.isAfter(event.getDate()) ? 1 : -1;
    }

    private LocalDate date;
    private String category;
    private String description;

    public static String getDifferenceString(Period p) {
        StringBuilder sb = new StringBuilder();

        int years = Math.abs(p.getYears());
        int months = Math.abs(p.getMonths());
        int days = Math.abs(p.getDays());

        // If all components are zero, must be today
        if (years == 0 && months == 0 && days == 0) {
            sb.append("today");
            return sb.toString();
        }

        if (years != 0)
        {
            sb.append(years + " years ");
        }
        if (months != 0)
        {
            sb.append(months + " months ");
        }
        if (days != 0)
        {
            sb.append(days + " days ");
        }

        if (p.isNegative()) {
            sb.insert(0, "in ");
        }
        else {
            sb.append("ago");
        }

        return sb.toString();
    }
}
