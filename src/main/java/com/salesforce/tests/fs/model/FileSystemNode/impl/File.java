package com.salesforce.tests.fs.model.FileSystemNode.impl;

import com.salesforce.tests.fs.model.FileSystemNode.FSNode;

public class File extends FSNode {
    private String content;

    public boolean isDirectory() {
        return false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
