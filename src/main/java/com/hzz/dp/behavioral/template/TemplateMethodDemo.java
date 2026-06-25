package com.hzz.dp.behavioral.template;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== 制作茶 ===");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        System.out.println("=== 制作咖啡 ===");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
