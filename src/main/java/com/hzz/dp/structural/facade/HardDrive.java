package com.hzz.dp.structural.facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("硬盘: 读取 " + lba + " 位置, " + size + " 字节");
        return new byte[size];
    }
}
