package io.github.tommiri.days.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.converters.ISO8601DateConverter;

import java.time.LocalDate;

@Parameters(commandNames = "add", commandDescription = "Add new events")
public class CommandAdd extends CommandBase {
    @Parameter(names = "--date", description = "Specify date for new event", converter =
            ISO8601DateConverter.class)
    public LocalDate date = LocalDate.now();
    @Parameter(names = "--category", description = "Specify category for new event")
    public String category;
    @Parameter(names = "--description", description = "Specify description for new event", required = true)
    public String description;
}