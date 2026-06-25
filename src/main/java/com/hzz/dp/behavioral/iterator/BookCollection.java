package com.hzz.dp.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public int size() {
        return books.size();
    }

    public Book get(int index) {
        return books.get(index);
    }

    public BookIterator<Book> forwardIterator() {
        return new ForwardIterator(this);
    }

    public BookIterator<Book> reverseIterator() {
        return new ReverseIterator(this);
    }

    private static class ForwardIterator implements BookIterator<Book> {
        private final BookCollection collection;
        private int position = 0;

        ForwardIterator(BookCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return position < collection.size();
        }

        @Override
        public Book next() {
            return collection.get(position++);
        }
    }

    private static class ReverseIterator implements BookIterator<Book> {
        private final BookCollection collection;
        private int position;

        ReverseIterator(BookCollection collection) {
            this.collection = collection;
            this.position = collection.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return position >= 0;
        }

        @Override
        public Book next() {
            return collection.get(position--);
        }
    }
}
