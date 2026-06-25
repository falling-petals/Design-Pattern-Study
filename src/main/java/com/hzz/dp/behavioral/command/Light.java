package com.hzz.dp.behavioral.command;

public class Light {
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 灯打开");
    }

    public void off() {
        System.out.println(location + " 灯关闭");
    }
}
