package com.hzz.dp.behavioral.strategy;

public class CardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("银行卡支付: %.2f 元 (需要输入密码)\n", amount);
    }
}
