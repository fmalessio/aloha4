package com.salesforce.tests.fs.model.FileSystemNode;

public abstract class FSNode {
    private String name;

    public abstract boolean isDirectory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
