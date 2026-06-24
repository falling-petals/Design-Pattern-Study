package com.hzz.dp.creational.factory;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    protected Logger createLogger() {
        return new FileLogger();
    }
}
