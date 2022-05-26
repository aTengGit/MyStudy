package com.lhu.mystudy.javamain.designpatter.factory.factorymethod;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class BJStyleCheesePizza extends Pizza {

    public BJStyleCheesePizza() {
        name = "北京风味的番茄披萨";
        dough = "中筋面粉";
        sauce = "番茄酱";

        toppings.add("北京口味葱丝");
    }

    @Override
    void cut() {
        System.out.println("Cutting ：  将披萨切成正方形");
    }
}