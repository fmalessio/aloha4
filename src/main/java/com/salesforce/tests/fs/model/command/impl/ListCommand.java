package com.salesforce.tests.fs.model.command.impl;

import com.salesforce.tests.fs.model.CMDProcessor;
import com.salesforce.tests.fs.model.FileSystemNode.FSNode;
import com.salesforce.tests.fs.model.command.Command;

import java.util.HashMap;
import java.util.Map;

public class ListCommand extends Command {

    public ListCommand(String name, CMDProcessor cmd) {
        super(name, cmd);
    }

    public boolean execute() {
        HashMap<String, FSNode> subNodes = this.getCmd().getCurrentDir().getSubNodes();
        if(subNodes != null) {
            for (Map.Entry<String, FSNode> entry : subNodes.entrySet()) {
                String name = entry.getValue().isDirectory() ?
                        entry.getValue().getName() + "/" :
                        entry.getValue().getName();
                System.out.println(name);
            }
        }
        return true;
    }
}
