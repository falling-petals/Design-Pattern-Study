package com.hzz.dp.behavioral.template;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
