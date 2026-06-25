package com.hzz.dp.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red(), 10);
        Shape blueCircle = new Circle(new Blue(), 15);
        Shape redSquare = new Square(new Red(), 5);
        Shape blueSquare = new Square(new Blue(), 8);

        System.out.println(redCircle.draw());
        System.out.println(blueCircle.draw());
        System.out.println(redSquare.draw());
        System.out.println(blueSquare.draw());
    }
}
