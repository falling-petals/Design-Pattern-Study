package com.hzz.dp.creational.factory;

public class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    protected Logger createLogger() {
        return new ConsoleLogger();
    }
}
