import java.time.LocalDate;
import java.time.Period;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.Collections;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Shows events from file.
 */
public class Days {
    /**
     * Main program.
     * 
     * @param args command-line arguments
     */
    public static void main(String... args) {
        LocalDate today = LocalDate.now();
        String birthdateString = System.getenv("BIRTHDATE");
        if (birthdateString != null && !birthdateString.isBlank()) {
            StringBuilder message = new StringBuilder();
            LocalDate birthdate = LocalDate.parse(birthdateString);

            // Check if it's user's birthday
            if (today.getMonth() == birthdate.getMonth() &&
                today.getDayOfMonth() == birthdate.getDayOfMonth()) {
                message.append("Happy birthday! ");
            }

            // Get user's age in days
            long ageInDays = DAYS.between(birthdate, today);
            message.append("You are ").append(ageInDays).append(" days old.");

            // Check if user's age is divisible by 1000
            if (ageInDays % 1000 == 0) {
                message.append(" That's a nice round number!");
            }
            System.out.println(message);
        }
        
        String userHomeDirectory = System.getProperty("user.home");
        if (userHomeDirectory.isBlank()) {
            System.out.println("Unable to determine user home directory");
            System.exit(-1);
        }

        Path daysPath = Paths.get(userHomeDirectory, ".days");
        if (Files.notExists(daysPath)) {
            System.out.println(daysPath + " directory does not exist, please create it");
            System.exit(-1);
        }
        Path eventsPath = daysPath.resolve("events.csv");
        if (Files.notExists(eventsPath)) {
            System.out.println(eventsPath + " file not found");
            System.exit(-1);
        }

        //System.out.println("Using EventManager to load events");
        EventManager eventManager = EventManager.getInstance();
        boolean success = eventManager.loadEvents(eventsPath);
        if (!success) {
            System.err.println("Error loading events");
            System.exit(-1);
        }
        //System.out.println("Events loaded successfully");
        List<Event> events = eventManager.getEvents();

        Collections.sort(events);

        // If we are still here, we might have some events
        // in the list. Print them out:
        for (Event event: events) {
            System.out.print(event + " -- ");

            Period difference = Period.between(event.getDate(), today);
            //System.out.println("diff = " + diff);

            System.out.println(Event.getDifferenceString(difference));
        }
    }
}
