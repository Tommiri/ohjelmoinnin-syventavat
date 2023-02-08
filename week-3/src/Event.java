import java.time.LocalDate;
import java.time.Period;
import java.lang.StringBuilder;

public class Event {
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

    public String getDifferenceString(Period period) {
        // Check for zero at the start of the method to avoid unnecessary parsing
        if (period.isZero()) {
            return "today";
        }

        // Extract y/m/d into variables from period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Use StringBuilder to allow string manipulation
        StringBuilder periodString = new StringBuilder();

        // Only append y/m/d to string if greater than 0 and omit 's' if equal to 1
        if (years > 0) {
            periodString.append(years).append(years == 1 ? " year " : " years ");
        }
        if (months > 0) {
            periodString.append(months).append(months == 1 ? " month " : " months ");
        }
        if (days > 0) {
            periodString.append(days).append(days == 1 ? " day" : " days");
        }

        // If period is negative, event is in the future
        if (period.isNegative()) {
            periodString.insert(0, "in ");
        } else {
            periodString.append(" ago");
        }

        return periodString.toString();
    }

    @Override
    public String toString() {
        return this.date + ": " 
            + this.description
            + " (" + this.category + ")"; 
    }

    private final LocalDate date;
    private String category;
    private String description;
}