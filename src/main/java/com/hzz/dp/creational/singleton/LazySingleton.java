package com.hzz.dp.creational.singleton;

public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("LazySingleton do something");
    }
}
