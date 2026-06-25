package com.hzz.dp.behavioral.memento;

import java.util.List;
import java.util.ArrayList;

public class TextDocumentMemento {
    private final List<String> content;

    public TextDocumentMemento(List<String> content) {
        this.content = new ArrayList<>(content);
    }

    public List<String> getContent() {
        return new ArrayList<>(content);
    }
}
