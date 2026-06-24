package com.hzz.dp.creational.singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    private static class Holder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("StaticInnerSingleton do something");
    }
}
