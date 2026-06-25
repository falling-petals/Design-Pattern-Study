package com.hzz.dp.structural.facade;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("内存: 从 " + position + " 加载数据");
    }

    public void clear() {
        System.out.println("内存: 清空");
    }
}
