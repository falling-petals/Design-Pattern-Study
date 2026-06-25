package com.hzz.dp.behavioral.chain;

public abstract class LoggerHandler {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    protected int level;
    protected LoggerHandler next;

    public void setNext(LoggerHandler next) {
        this.next = next;
    }

    public void log(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (next != null) {
            next.log(level, message);
        }
    }

    protected abstract void write(String message);
}
