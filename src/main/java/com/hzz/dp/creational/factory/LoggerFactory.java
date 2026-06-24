package com.hzz.dp.creational.factory;

public abstract class LoggerFactory {
    public void writeLog(String message) {
        Logger logger = createLogger();
        logger.log(message);
    }

    protected abstract Logger createLogger();
}
