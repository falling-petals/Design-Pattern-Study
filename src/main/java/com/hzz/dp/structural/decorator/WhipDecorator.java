package com.hzz.dp.structural.decorator;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + 奶油";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 2.0;
    }
}
