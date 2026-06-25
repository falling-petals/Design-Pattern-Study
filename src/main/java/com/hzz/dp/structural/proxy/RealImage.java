package com.hzz.dp.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("加载高清图片: " + fileName + "（耗时2秒）");
    }

    @Override
    public void display() {
        System.out.println("显示图片: " + fileName);
    }
}
