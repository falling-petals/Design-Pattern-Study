package com.hzz.dp.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("EagerSingleton do something");
    }
}
