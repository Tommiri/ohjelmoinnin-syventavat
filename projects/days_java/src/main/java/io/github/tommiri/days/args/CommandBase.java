package io.github.tommiri.days.args;

import com.beust.jcommander.Parameter;

public class CommandBase {
    @Parameter(names = {"-h", "--help"}, help = true, description = "Display usage")
    public boolean help;

    @Parameter(names = "--dry-run", description = "Display results of specified actions without executing them")
    public boolean dry_run;
}