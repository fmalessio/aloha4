package com.salesforce.tests.fs.model.FileSystemNode.impl;

import com.salesforce.tests.fs.model.FileSystemNode.FSNode;
import java.util.HashMap;

public class Directory extends FSNode {

    private Directory parent;
    private HashMap<String, FSNode> subNodes;

    public Directory(String name, Directory parent) {
        this.setName(name);
        this.setParent(parent);
        this.subNodes = new HashMap<String, FSNode>();
    }

    public boolean addDirectory(Directory dir) {
        if(subNodes.put(dir.getName(), dir) != null) {
            return true;
        }
        return false;
    }

    public boolean isDirectory() {
        return true;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public HashMap<String, FSNode> getSubNodes() {
        return subNodes;
    }

    public void setSubNodes(HashMap<String, FSNode> subNodes) {
        this.subNodes = subNodes;
    }
}
