package com.lhu.mystudy.javamain.designpatter.factory.factorymethod;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        SHPizzaStore shPizzaStore = new SHPizzaStore();
        BJPizzaStore bjPizzaStore = new BJPizzaStore();

        Pizza pizza = shPizzaStore.orderPizza("shanghai");
        System.out.println(" 所订购的是：" +pizza.getName());

        Pizza pizza1 = bjPizzaStore.orderPizza("beijing");
        System.out.println(" 所订购的是：" +pizza1.getName());
    }
}
