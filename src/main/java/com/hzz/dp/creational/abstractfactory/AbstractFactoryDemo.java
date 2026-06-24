package com.hzz.dp.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIFactory factory;

        factory = new LightUIFactory();
        factory.createButton().render();
        factory.createTextField().display();

        System.out.println("---");

        factory = new DarkUIFactory();
        factory.createButton().render();
        factory.createTextField().display();
    }
}
