package com.hzz.dp.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        System.out.println("=== 场景1: 正常购买流程 ===");
        machine.insertCoin();
        machine.pressButton();

        System.out.println();
        System.out.println("=== 场景2: 直接按按钮(未投币) ===");
        machine.pressButton();

        System.out.println();
        System.out.println("=== 场景3: 投币后退币 ===");
        machine.insertCoin();
        machine.ejectCoin();

        System.out.println();
        System.out.println("=== 场景4: 买完最后一瓶 ===");
        machine.insertCoin();
        machine.pressButton();

        System.out.println();
        System.out.println("=== 场景5: 售罄后尝试投币 ===");
        machine.insertCoin();
    }
}
