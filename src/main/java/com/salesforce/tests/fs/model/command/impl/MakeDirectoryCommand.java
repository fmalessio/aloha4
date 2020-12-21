package com.salesforce.tests.fs.model.command.impl;

import com.salesforce.tests.fs.model.CMDProcessor;
import com.salesforce.tests.fs.model.FileSystemNode.impl.Directory;
import com.salesforce.tests.fs.model.command.Command;

public class MakeDirectoryCommand extends Command {

    public MakeDirectoryCommand(String name, CMDProcessor cmd) {
        super(name, cmd);
    }

    public boolean execute() {
        String param = this.getParameters();
        if(isValid(param)) {
            if(getCmd().getCurrentDir().getSubNodes().get(param) != null) {
                System.out.println("Directory already exists");
                return false;
            }
            getCmd().getCurrentDir().getSubNodes()
                    .put(param, new Directory(param, getCmd().getCurrentDir()));
            return true;
        } else {
            System.out.println("Invalid parameters");
        }
        return false;
    }

    private boolean isValid(String dirName) {
        return dirName != null && dirName.length() <= 100;
    }
}
