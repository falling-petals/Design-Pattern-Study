package com.hzz.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> cache = new HashMap<>();

    static {
        Circle circle = new Circle(10);
        circle.id = "1";

        Rectangle rect = new Rectangle(20, 30);
        rect.id = "2";

        cache.put(circle.id, circle);
        cache.put(rect.id, rect);
    }

    public static Shape getShape(String id) {
        Shape shape = cache.get(id);
        return shape != null ? shape.clone() : null;
    }
}
