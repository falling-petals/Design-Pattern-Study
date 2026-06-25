package com.hzz.dp.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("===== 电脑启动 =====");
        cpu.freeze();
        memory.clear();
        byte[] bootData = hardDrive.read(0, 1024);
        memory.load(0, bootData);
        cpu.jump(0);
        cpu.execute();
        System.out.println("===== 启动完成 =====");
    }

    public void shutdown() {
        System.out.println("===== 电脑关机 =====");
        cpu.freeze();
        memory.clear();
        System.out.println("===== 已关机 =====");
    }
}
