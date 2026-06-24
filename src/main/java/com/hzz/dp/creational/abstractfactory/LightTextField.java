package com.hzz.dp.creational.abstractfactory;

public class LightTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示【浅色】文本框");
    }
}
