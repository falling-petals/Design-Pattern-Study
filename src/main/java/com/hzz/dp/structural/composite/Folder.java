package com.hzz.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    public void remove(FileSystemNode node) {
        children.remove(node);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📁 " + name + "/");
        children.forEach(child -> child.display(indent + "    "));
    }

    @Override
    public long getSize() {
        return children.stream().mapToLong(FileSystemNode::getSize).sum();
    }
}
