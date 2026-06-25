package com.hzz.dp.structural.facade;

public class CPU {
    public void freeze() {
        System.out.println("CPU: 停止执行");
    }

    public void jump(long position) {
        System.out.println("CPU: 跳转到 " + position);
    }

    public void execute() {
        System.out.println("CPU: 执行程序");
    }
}
