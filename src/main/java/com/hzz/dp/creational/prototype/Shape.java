package com.hzz.dp.creational.prototype;

public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
