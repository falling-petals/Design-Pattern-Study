package com.hzz.dp.behavioral.template;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("冲泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }
}
