package com.hzz.dp.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("EnumSingleton do something");
    }
}
