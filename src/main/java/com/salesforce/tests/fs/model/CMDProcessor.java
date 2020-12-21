package com.salesforce.tests.fs.model;

import com.salesforce.tests.fs.model.FileSystemNode.FSNode;
import com.salesforce.tests.fs.model.FileSystemNode.impl.Directory;
import com.salesforce.tests.fs.model.command.Command;
import com.salesforce.tests.fs.model.command.impl.CurrentDirectoryCommand;
import com.salesforce.tests.fs.model.command.impl.ListCommand;
import com.salesforce.tests.fs.model.command.impl.MakeDirectoryCommand;
import com.salesforce.tests.fs.model.command.impl.QuitCommand;

import java.util.HashMap;

public class CMDProcessor {

    private HashMap<String, FSNode> directories;
    private Directory currentDir;
    private HashMap<String, Command> commands;
    private String lineReaded;

    public CMDProcessor() {
        this.setDirectories(new HashMap<String, FSNode>());
        Directory root = new Directory("root", null);
        this.currentDir = root;
        this.directories.put(root.getName(), root);
        this.initCommands();
    }

    private void initCommands() {
        this.commands = new HashMap<String, Command>();
        this.commands.put("quit", new QuitCommand("quit", this));
        this.commands.put("pwd", new CurrentDirectoryCommand("pwd", this));
        this.commands.put("mkdir", new MakeDirectoryCommand("mkdir", this));
        this.commands.put("ls", new ListCommand("ls", this));
    }

    public HashMap<String, FSNode> getDirectories() {
        return directories;
    }

    public void setDirectories(HashMap<String, FSNode> directories) {
        this.directories = directories;
    }

    public Directory getCurrentDir() {
        return currentDir;
    }

    public void setCurrentDir(Directory currentDir) {
        this.currentDir = currentDir;
    }

    public HashMap<String, Command> getCommands() {
        return commands;
    }

    public void setCommands(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    public String getLineReaded() {
        return lineReaded;
    }

    public void setLineReaded(String lineReaded) {
        this.lineReaded = lineReaded;
    }
}
