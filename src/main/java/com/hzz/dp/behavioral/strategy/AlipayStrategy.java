package com.hzz.dp.behavioral.strategy;

public class AlipayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("支付宝支付: %.2f 元 (使用余额宝)\n", amount);
    }
}
