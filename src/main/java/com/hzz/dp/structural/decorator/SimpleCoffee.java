package com.hzz.dp.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "普通咖啡";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
