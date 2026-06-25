package com.hzz.dp.behavioral.visitor;

public class Heading implements DocumentElement {
    private final String text;
    private final int level;

    public Heading(String text, int level) {
        this.text = text;
        this.level = level;
    }

    public String getText() { return text; }
    public int getLevel() { return level; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
