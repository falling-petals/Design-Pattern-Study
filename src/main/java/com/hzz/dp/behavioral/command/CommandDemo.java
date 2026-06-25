package com.hzz.dp.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light("客厅");
        Light bedroomLight = new Light("卧室");

        Command livingOn = new LightOnCommand(livingRoomLight);
        Command livingOff = new LightOffCommand(livingRoomLight);
        Command bedroomOn = new LightOnCommand(bedroomLight);
        Command bedroomOff = new LightOffCommand(bedroomLight);

        System.out.println("=== 打开客厅灯 ===");
        remote.pressButton(livingOn);

        System.out.println();
        System.out.println("=== 打开卧室灯 ===");
        remote.pressButton(bedroomOn);

        System.out.println();
        System.out.println("=== 撤销一次(卧室灯关闭) ===");
        remote.pressUndo();

        System.out.println();
        System.out.println("=== 撤销一次(客厅灯关闭) ===");
        remote.pressUndo();

        System.out.println();
        System.out.println("=== 撤销无操作 ===");
        remote.pressUndo();
    }
}
