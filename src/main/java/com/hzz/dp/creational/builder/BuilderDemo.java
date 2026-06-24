package com.hzz.dp.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder()
                .cpu("i9-14900K")
                .ram("32GB")
                .storage("1TB SSD")
                .gpu("RTX 4090")
                .cooling("水冷")
                .build();

        Computer cheapPc = new Computer.Builder()
                .cpu("i5-13400")
                .ram("16GB")
                .storage("512GB SSD")
                .build();

        System.out.println(pc);
        System.out.println(cheapPc);
    }
}
