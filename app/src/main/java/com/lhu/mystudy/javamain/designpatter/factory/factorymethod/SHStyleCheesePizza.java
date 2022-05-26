package com.lhu.mystudy.javamain.designpatter.factory.factorymethod;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class SHStyleCheesePizza extends Pizza {

    public SHStyleCheesePizza() {
        name = "上海风味的虾仁披萨";
        dough = "高精面粉";
        sauce = "虾仁";

        toppings.add("上海特制调料");
    }
}
