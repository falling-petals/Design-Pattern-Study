package com.hzz.dp.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        TextDocumentEditor editor = new TextDocumentEditor();

        System.out.println("=== 初始状态 ===");
        editor.showContent();

        System.out.println();
        System.out.println("=== 插入第一行 ===");
        editor.insertText("这是第一行");
        editor.showContent();

        System.out.println();
        System.out.println("=== 插入第二行 ===");
        editor.insertText("这是第二行");
        editor.showContent();

        System.out.println();
        System.out.println("=== 删除第二行 ===");
        editor.deleteText(2);
        editor.showContent();

        System.out.println();
        System.out.println("=== 撤销一次 ===");
        editor.undo();
        editor.showContent();

        System.out.println();
        System.out.println("=== 撤销一次 ===");
        editor.undo();
        editor.showContent();

        System.out.println();
        System.out.println("=== 撤销一次 ===");
        editor.undo();
        editor.showContent();

        System.out.println();
        System.out.println("=== 撤销无操作 ===");
        editor.undo();
    }
}
