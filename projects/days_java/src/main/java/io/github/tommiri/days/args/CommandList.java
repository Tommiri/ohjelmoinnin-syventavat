package io.github.tommiri.days.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.time.LocalDate;
import java.util.List;

@Parameters(commandNames = "list", commandDescription = "List events")
public class CommandList extends CommandBase {
    @Parameter(names = "--today", description = "List events happening today")
    public boolean today;
    @Parameter(names = "--before-date", description = "List events before specified date", converter = LocalDateConverter.class)
    public LocalDate before_date;
    @Parameter(names = "--after-date", description = "List events after specified date", converter = LocalDateConverter.class)
    public LocalDate after_date;
    @Parameter(names = "--date", description = "List events on specified date", converter = LocalDateConverter.class)
    public LocalDate date;
    @Parameter(names = "--categories", description = "List events from specified categories")
    public List<String> categories;
    @Parameter(names = "--exclude", description = "List events excluding ones fitting specified parameters")
    public boolean exclude;
    @Parameter(names = "--no-category", description = "List events with no category")
    public boolean no_category;
}