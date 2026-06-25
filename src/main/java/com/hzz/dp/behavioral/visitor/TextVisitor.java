package com.hzz.dp.behavioral.visitor;

public class TextVisitor implements DocumentVisitor {
    private final StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Heading heading) {
        sb.append("=== ").append(heading.getText()).append(" ===\n");
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append(paragraph.getText()).append("\n\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
