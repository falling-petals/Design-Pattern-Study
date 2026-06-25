package com.hzz.dp.behavioral.state;

public class SoldState implements State {
    private final VendingMachine machine;

    public SoldState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("正在出货，请稍候");
    }

    @Override
    public void ejectCoin() {
        System.out.println("正在出货，无法退币");
    }

    @Override
    public void pressButton() {
        System.out.println("正在出货，请勿重复按按钮");
    }

    @Override
    public void dispense() {
        machine.releaseProduct();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
        } else {
            System.out.println("商品已售罄");
            machine.setState(machine.getSoldOutState());
        }
    }
}
