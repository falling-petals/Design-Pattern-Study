package com.hzz.dp.structural.bridge;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "画一个" + color.fill() + "的圆形, 半径=" + radius;
    }
}
