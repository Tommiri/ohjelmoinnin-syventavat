package io.github.tommiri.days.args;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

public class ArgsHandler {
    public static void handleArgs(String... args) {
        CommandBase baseCmd = new CommandBase();
        CommandList listCmd = new CommandList();
        CommandAdd addCmd = new CommandAdd();
        CommandDelete deleteCmd = new CommandDelete();

        JCommander jc = JCommander.newBuilder()
                .addObject(baseCmd)
                .addCommand("list", listCmd)
                .addCommand("add", addCmd)
                .addCommand("delete", deleteCmd)
                .build();

        jc.setProgramName("days");

        try {
            jc.parse(args);
            String parsedCommand = jc.getParsedCommand();

            if (parsedCommand == null) {
                showUsage(jc);
            } else if (isHelpRequested(listCmd, addCmd, deleteCmd)) {
                showUsage(jc, parsedCommand);
            }

            switch (parsedCommand) {
                case "list" -> handleListCommand(listCmd);
                case "add" -> handleAddCommand(addCmd);
                case "delete" -> handleDeleteCommand(deleteCmd);
            }

        } catch (ParameterException e) {
            System.err.println(e.getMessage());
            showUsage(jc);
        }

    }

    private static void handleListCommand(CommandList cmd) {
        
    }

    private static void handleAddCommand(CommandAdd cmd) {

    }

    private static void handleDeleteCommand(CommandDelete cmd) {

    }

    private static boolean isHelpRequested(CommandBase... commands) {
        for (CommandBase cmd : commands) {
            if (cmd.help) {
                return true;
            }
        }
        return false;
    }

    private static void showUsage(JCommander jc, String command) {
        jc.getUsageFormatter().usage(command);
        System.exit(0);
    }

    private static void showUsage(JCommander jc) {
        jc.usage();
        System.exit(0);
    }
}