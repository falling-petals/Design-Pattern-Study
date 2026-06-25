package com.hzz.dp.structural.bridge;

public class Square extends Shape {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return "画一个" + color.fill() + "的正方形, 边长=" + side;
    }
}
