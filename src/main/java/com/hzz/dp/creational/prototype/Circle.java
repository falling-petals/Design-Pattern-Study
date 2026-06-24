package com.hzz.dp.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.type = "圆形";
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("画一个半径=" + radius + "的" + type);
    }
}
