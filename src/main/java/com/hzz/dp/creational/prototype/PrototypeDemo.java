package com.hzz.dp.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Shape clonedCircle = ShapeCache.getShape("1");
        clonedCircle.draw();

        Shape clonedRect = ShapeCache.getShape("2");
        clonedRect.draw();

        System.out.println("--- 验证是不同对象 ---");
        Shape c1 = ShapeCache.getShape("1");
        Shape c2 = ShapeCache.getShape("1");
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1.getClass() == c2.getClass(): " + (c1.getClass() == c2.getClass()));
    }
}
