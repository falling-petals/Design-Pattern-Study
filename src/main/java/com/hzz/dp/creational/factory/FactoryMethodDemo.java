package com.hzz.dp.creational.factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        LoggerFactory factory;

        factory = new ConsoleLoggerFactory();
        factory.writeLog("用户登录成功");

        factory = new FileLoggerFactory();
        factory.writeLog("系统异常，请检查");
    }
}
