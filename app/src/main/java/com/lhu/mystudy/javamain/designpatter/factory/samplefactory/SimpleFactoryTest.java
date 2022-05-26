package com.lhu.mystudy.javamain.designpatter.factory.samplefactory;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza("beijing");
    }
}
