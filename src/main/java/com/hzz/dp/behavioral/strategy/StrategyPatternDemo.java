package com.hzz.dp.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD-001", 299.00);

        // 运行时切换策略
        order.setStrategy(new AlipayStrategy());
        order.checkout();

        System.out.println();

        order.setStrategy(new WechatStrategy());
        order.checkout();

        System.out.println();

        order.setStrategy(new CardStrategy());
        order.checkout();
    }
}
