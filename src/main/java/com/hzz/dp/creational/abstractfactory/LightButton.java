package com.hzz.dp.creational.abstractfactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染【浅色】按钮");
    }
}
