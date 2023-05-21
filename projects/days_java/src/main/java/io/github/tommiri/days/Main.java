package io.github.tommiri.days;

import io.github.tommiri.days.args.ArgsHandler;
import io.github.tommiri.days.event.Event;
import io.github.tommiri.days.event.EventManager;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.List;

/**
 * Shows events from file.
 */
public class Main {
    /**
     * Main program.
     *
     * @param args command-line arguments
     */
    public static void main(String... args) {
        ArgsHandler.handleArgs(args);

        LocalDate today = LocalDate.now();
        EventManager eventManager = EventManager.getInstance();
        Path eventsPath = eventManager.getEventsPath();

        if (eventsPath == null) {
            System.exit(-1);
        }

        boolean success = eventManager.loadEvents(eventsPath);
        if (!success) {
            System.err.println("Error loading events");
            System.exit(-1);
        }

        List<Event> events = eventManager.getEvents();

        Collections.sort(events);

        // If we are still here, we might have some events
        // in the list. Print them out:
        for (Event event : events) {
            System.out.print(event + " -- ");

            Period difference = Period.between(event.getDate(), today);

            System.out.println(Event.getDifferenceString(difference));
        }
    }

}