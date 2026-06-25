package com.hzz.dp.behavioral.chain;

public class DebugLogger extends LoggerHandler {
    public DebugLogger() {
        this.level = DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
