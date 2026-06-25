package com.hzz.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, ChessPieceFlyweight> pool = new HashMap<>();

    public static ChessPieceFlyweight getFlyweight(String name, String color) {
        String key = color + "_" + name;
        ChessPieceFlyweight fw = pool.get(key);
        if (fw == null) {
            fw = new ChessPieceFlyweight(name, color, color.toLowerCase() + "_" + name.toLowerCase() + ".png");
            pool.put(key, fw);
            System.out.println("  [创建新享元: " + key + "]");
        }
        return fw;
    }

    public static int poolSize() {
        return pool.size();
    }
}
