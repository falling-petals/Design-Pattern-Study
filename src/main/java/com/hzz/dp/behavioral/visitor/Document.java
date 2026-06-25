package com.hzz.dp.behavioral.visitor;

import java.util.List;

public class Document {
    private final List<DocumentElement> elements;

    public Document(List<DocumentElement> elements) {
        this.elements = elements;
    }

    public void accept(DocumentVisitor visitor) {
        for (DocumentElement element : elements) {
            element.accept(visitor);
        }
    }
}
