package com.hzz.dp.creational.factory;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[File] " + message + " (已写入日志文件)");
    }
}
