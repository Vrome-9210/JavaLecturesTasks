package Lec18;

import java.util.Scanner;

public class Main {

    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[]{
            new CommandAndResult("/help", ""),
            new CommandAndResult("/start", "Bot started!..."),
            new CommandAndResult("/getLocation", "Location in Moscow"),
            new CommandAndResult("/end", "Bot ended")
    };

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = "commands available for this bot \n";
        for (CommandAndResult item : COMMAND_AND_RESULTS) {
            commands += item.command + "\n";
        }
        COMMAND_AND_RESULTS[0] = new CommandAndResult(COMMAND_AND_RESULTS[0].command, commands);

        String input;
        boolean found;
        while (true) {
            input = scanner.nextLine();
            found = false;
            for (int i = 0; i < COMMAND_AND_RESULTS.length; i++) {
                if (COMMAND_AND_RESULTS[i].command.equals(input)) {
                    System.out.println(COMMAND_AND_RESULTS[i].result);
                    found = true;
                    break;
                }
            }
            if (COMMAND_AND_RESULTS[COMMAND_AND_RESULTS.length - 1].command.equals(input)) {
                break;
            }
            if (!found) {
                System.out.println("no command found for that input. Try typing " + COMMAND_AND_RESULTS[0].command);
            }
        }
//        COMMAND_AND_RESULT[0].command = "/help";
//        COMMAND_AND_RESULT[0].result = "";
//        COMMAND_AND_RESULT[1].command = "/start";
//        COMMAND_AND_RESULT[1].result = "Bot started!...";
//        CommandAndResult commandAndResult = new CommandAndResult("my command", "my result");
    }
//    private static final CommandAndResult[] COMMAND_AND_RESULT = new CommandAndResult[] {
//            new CommandAndResult(), new CommandAndResult(), new CommandAndResult(), new CommandAndResult(),
//    };
//
//    private static final String[] COMMANDS = new String[] {
//            "/help", "/start", "/end", "/getLocation"
//    };
//
//    private static final String[] RESULTS = new String[] {
//            "", "Bot started!...", "Bot ended", "Location in Moscow"
//    };
}
