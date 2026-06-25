package com.hzz.dp.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        System.out.println();
        computer.shutdown();
    }
}
