package com.hzz.dp.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.cost() + "元");

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " = " + milkCoffee.cost() + "元");

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + " = " + sugarMilkCoffee.cost() + "元");

        Coffee fullCoffee = new WhipDecorator(
                new SugarDecorator(
                        new MilkDecorator(new SimpleCoffee())));
        System.out.println(fullCoffee.getDescription() + " = " + fullCoffee.cost() + "元");
    }
}
