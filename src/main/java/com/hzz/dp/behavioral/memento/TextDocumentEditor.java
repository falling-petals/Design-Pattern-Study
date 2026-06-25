package com.hzz.dp.behavioral.memento;

import java.util.Stack;

public class TextDocumentEditor {
    private final TextDocument document;
    private final Stack<TextDocumentMemento> history = new Stack<>();

    public TextDocumentEditor() {
        this.document = new TextDocument();
    }

    public void insertText(String text) {
        document.addLine(text);
        history.push(document.save());
    }

    public void deleteText(int lineNumber) {
        document.removeLine(lineNumber - 1);
        history.push(document.save());
    }

    public void undo() {
        if (!history.isEmpty()) {
            TextDocumentMemento memento = history.pop();
            document.restore(memento);
        } else {
            System.out.println("没有可撤销的操作");
        }
    }

    public void showContent() {
        document.printContent();
    }
}
