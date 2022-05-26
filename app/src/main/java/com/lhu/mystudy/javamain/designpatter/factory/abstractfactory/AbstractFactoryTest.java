package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore bjPizzaStore = new BJPizzaStore();
        PizzaStore shPizzaStore = new SHPizzaStore();

        bjPizzaStore.orderPizza("cheese");
        System.out.println("===========================： ");
        shPizzaStore.orderPizza("clam");
    }
}
