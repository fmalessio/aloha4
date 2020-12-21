package com.salesforce.tests.fs;

import com.salesforce.tests.fs.model.CMDProcessor;
import com.salesforce.tests.fs.model.command.Command;

import java.util.Scanner;

/**
 * The entry point for the Test program
 */
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        System.out.println("Shell started...");
        Scanner scanner = new Scanner(System.in);
        CMDProcessor cmd = new CMDProcessor();
        while (true) {
            String lineReaded = scanner.nextLine();
            String commandName = getCommandName(lineReaded);
            Command command = cmd.getCommands().get(commandName);
            if (command == null) {
                System.out.println("Unrecognized command");
            } else {
                cmd.setLineReaded(lineReaded);
                command.execute();
            }
        }
    }

    private static String getCommandName(String command) {
        return command.contains(" ") ? command.split(" ")[0] : command;
    }

}
