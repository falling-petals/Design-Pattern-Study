package com.hzz.dp.behavioral.visitor;

public class Paragraph implements DocumentElement {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() { return text; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
