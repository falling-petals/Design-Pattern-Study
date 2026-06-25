package com.hzz.dp.behavioral.visitor;

public class HtmlVisitor implements DocumentVisitor {
    private final StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Heading heading) {
        sb.append("<h").append(heading.getLevel()).append(">")
          .append(heading.getText())
          .append("</h").append(heading.getLevel()).append(">\n");
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append("<p>").append(paragraph.getText()).append("</p>\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
