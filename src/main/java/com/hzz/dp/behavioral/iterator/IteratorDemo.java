package com.hzz.dp.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("设计模式", "GoF"));
        collection.addBook(new Book("重构", "Martin Fowler"));
        collection.addBook(new Book("代码整洁之道", "Robert C. Martin"));
        collection.addBook(new Book("Effective Java", "Joshua Bloch"));

        System.out.println("=== 正向遍历 ===");
        BookIterator<Book> forward = collection.forwardIterator();
        while (forward.hasNext()) {
            System.out.println(forward.next());
        }

        System.out.println();
        System.out.println("=== 反向遍历 ===");
        BookIterator<Book> reverse = collection.reverseIterator();
        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }
    }
}
