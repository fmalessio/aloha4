package com.salesforce.tests.fs.model.command.impl;

import com.salesforce.tests.fs.model.CMDProcessor;
import com.salesforce.tests.fs.model.command.Command;

public class QuitCommand extends Command {

    public QuitCommand(String name, CMDProcessor cmd) {
        super(name, cmd);
    }

    public boolean execute() {
        System.exit(0);
        return true;
    }
}
