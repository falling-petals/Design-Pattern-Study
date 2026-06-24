package com.hzz.dp.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        System.out.println("EagerSingleton: " + (s1 == s2));

        LazySingleton s3 = LazySingleton.getInstance();
        LazySingleton s4 = LazySingleton.getInstance();
        System.out.println("LazySingleton: " + (s3 == s4));

        DclSingleton s5 = DclSingleton.getInstance();
        DclSingleton s6 = DclSingleton.getInstance();
        System.out.println("DclSingleton: " + (s5 == s6));

        StaticInnerSingleton s7 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton s8 = StaticInnerSingleton.getInstance();
        System.out.println("StaticInnerSingleton: " + (s7 == s8));

        EnumSingleton s9 = EnumSingleton.INSTANCE;
        EnumSingleton s10 = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton: " + (s9 == s10));
    }
}
