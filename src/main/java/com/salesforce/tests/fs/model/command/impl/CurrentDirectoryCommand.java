package com.salesforce.tests.fs.model.command.impl;

import com.salesforce.tests.fs.model.CMDProcessor;
import com.salesforce.tests.fs.model.command.Command;

public class CurrentDirectoryCommand extends Command {

    public CurrentDirectoryCommand(String name, CMDProcessor cmd) {
        super(name, cmd);
    }

    public boolean execute() {
        String currentPath = this.getCmd().getCurrentDir().getName();
        System.out.println(currentPath);
        return true;
    }
}
