package com.hzz.dp.behavioral.chain;

public class InfoLogger extends LoggerHandler {
    public InfoLogger() {
        this.level = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO] " + message);
    }
}
