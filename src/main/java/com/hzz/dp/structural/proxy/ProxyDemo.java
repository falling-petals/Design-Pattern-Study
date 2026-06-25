package com.hzz.dp.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("风景.jpg");
        Image image2 = new ImageProxy("人物.jpg");

        System.out.println("--- 图片已创建，但还没加载 ---");

        image1.display();
        System.out.println("--- 再次显示 image1（不需要重新加载）---");
        image1.display();

        System.out.println("--- 显示 image2 ---");
        image2.display();
    }
}
