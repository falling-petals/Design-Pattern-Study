package com.hzz.dp.creational.abstractfactory;

public class DarkTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示【深色】文本框");
    }
}
