package com.hzz.dp.behavioral.template;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (needCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("烧水");
    }

    private void pourInCup() {
        System.out.println("倒入杯中");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected boolean needCondiments() {
        return true;
    }
}
