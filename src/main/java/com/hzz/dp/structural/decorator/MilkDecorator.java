package com.hzz.dp.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + 牛奶";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 3.0;
    }
}
