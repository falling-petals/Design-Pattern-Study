package com.hzz.dp.creational.abstractfactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染【深色】按钮");
    }
}
