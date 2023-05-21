package io.github.tommiri.days.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.converters.ISO8601DateConverter;

import java.time.LocalDate;

@Parameters(commandNames = "delete", commandDescription = "Delete events")
public class CommandDelete extends CommandBase {
    @Parameter(names = "--date", description = "Specify date for event to delete", converter =
            ISO8601DateConverter.class)
    public LocalDate date;
    @Parameter(names = "--category", description = "Specify category for event to delete")
    public String category;
    @Parameter(names = "--description", description = "Specify description for event to delete")
    public String description;
    @Parameter(names = "--all", description = "Delete all events")
    public boolean all;
}