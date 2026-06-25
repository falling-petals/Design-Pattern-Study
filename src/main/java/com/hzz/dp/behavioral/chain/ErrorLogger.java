package com.hzz.dp.behavioral.chain;

public class ErrorLogger extends LoggerHandler {
    public ErrorLogger() {
        this.level = ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("[ERROR] " + message);
    }
}
