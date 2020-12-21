package com.salesforce.tests.fs.model.command;

import com.salesforce.tests.fs.model.CMDProcessor;

public abstract class Command {

    private CMDProcessor cmd;
    private String name;

    public Command(String name, CMDProcessor cmd) {
        this.cmd = cmd;
        this.name = name;
    }

    public abstract boolean execute();

    protected String getParameters() {
        return cmd.getLineReaded().substring(name.length()).trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CMDProcessor getCmd() {
        return cmd;
    }

    public void setCmd(CMDProcessor cmd) {
        this.cmd = cmd;
    }
}
