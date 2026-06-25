package com.hzz.dp.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + 糖";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.5;
    }
}
