package com.hzz.dp.creational.singleton;

public class DclSingleton {
    private static volatile DclSingleton instance;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("DclSingleton do something");
    }
}
