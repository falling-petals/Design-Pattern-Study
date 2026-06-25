package com.hzz.dp.behavioral.state;

public class SoldOutState implements State {
    private final VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("商品已售罄，无法购买");
    }

    @Override
    public void ejectCoin() {
        System.out.println("没有硬币可退");
    }

    @Override
    public void pressButton() {
        System.out.println("商品已售罄");
    }

    @Override
    public void dispense() {
        System.out.println("商品已售罄");
    }
}
