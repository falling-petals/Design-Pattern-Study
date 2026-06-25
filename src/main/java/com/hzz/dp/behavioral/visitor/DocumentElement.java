package com.hzz.dp.behavioral.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
