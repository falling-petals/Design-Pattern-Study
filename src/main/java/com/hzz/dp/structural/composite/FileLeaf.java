package com.hzz.dp.structural.composite;

public class FileLeaf implements FileSystemNode {
    private final String name;
    private final long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📄 " + name + " (" + size + " bytes)");
    }

    @Override
    public long getSize() {
        return size;
    }
}
