package com.hzz.dp.behavioral.chain;

public class ChainDemo {
    public static void main(String[] args) {
        LoggerHandler debug = new DebugLogger();
        LoggerHandler info = new InfoLogger();
        LoggerHandler error = new ErrorLogger();

        debug.setNext(info);
        info.setNext(error);

        System.out.println("--- 发送 DEBUG 级别消息 ---");
        debug.log(LoggerHandler.DEBUG, "这是一个调试信息");

        System.out.println();
        System.out.println("--- 发送 INFO 级别消息 ---");
        debug.log(LoggerHandler.INFO, "这是一个普通信息");

        System.out.println();
        System.out.println("--- 发送 ERROR 级别消息 ---");
        debug.log(LoggerHandler.ERROR, "这是一个错误信息");
    }
}
