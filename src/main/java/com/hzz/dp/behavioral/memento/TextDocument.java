package com.hzz.dp.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class TextDocument {
    private final List<String> content = new ArrayList<>();

    public void addLine(String line) {
        content.add(line);
    }

    public void removeLine(int index) {
        if (index >= 0 && index < content.size()) {
            content.remove(index);
        }
    }

    public void printContent() {
        System.out.println("当前内容:");
        for (int i = 0; i < content.size(); i++) {
            System.out.println((i + 1) + ": " + content.get(i));
        }
    }

    public TextDocumentMemento save() {
        return new TextDocumentMemento(new ArrayList<>(content));
    }

    public void restore(TextDocumentMemento memento) {
        content.clear();
        content.addAll(memento.getContent());
    }
}
