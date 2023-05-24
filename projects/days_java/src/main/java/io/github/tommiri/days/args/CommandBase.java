package io.github.tommiri.days.args;

import com.beust.jcommander.Parameter;

/**
 * Base command that every command inherits from
 */
public class CommandBase {
    @Parameter(names = {"-h", "--help"}, help = true, description = "Display usage")
    public boolean help;
}