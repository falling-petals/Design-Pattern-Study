package com.hzz.dp.behavioral.visitor;

public interface DocumentVisitor {
    void visit(Heading heading);
    void visit(Paragraph paragraph);
}
