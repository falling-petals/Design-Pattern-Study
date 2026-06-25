package com.hzz.dp.structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Folder root = new Folder("root");

        Folder src = new Folder("src");
        src.add(new FileLeaf("Main.java", 1024));
        src.add(new FileLeaf("Utils.java", 512));

        Folder docs = new Folder("docs");
        docs.add(new FileLeaf("readme.txt", 128));
        docs.add(new FileLeaf("api.md", 256));

        Folder images = new Folder("images");
        images.add(new FileLeaf("logo.png", 20480));
        images.add(new FileLeaf("banner.jpg", 65536));

        docs.add(images);

        root.add(src);
        root.add(docs);
        root.add(new FileLeaf("pom.xml", 2048));

        root.display("");

        System.out.println("\n总大小: " + root.getSize() + " bytes");
    }
}
