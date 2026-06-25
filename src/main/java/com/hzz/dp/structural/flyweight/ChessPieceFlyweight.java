package com.hzz.dp.structural.flyweight;

public class ChessPieceFlyweight {
    private final String name;
    private final String color;
    private final String imagePath;

    public ChessPieceFlyweight(String name, String color, String imagePath) {
        this.name = name;
        this.color = color;
        this.imagePath = imagePath;
    }

    public void display(int row, int col) {
        System.out.println(color + name + " 在 (" + row + "," + col + ")  [纹理: " + imagePath + "]");
    }
}
