package com.lhu.mystudy.javamain.designpatter.factory.samplefactory;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("beijing")){
            pizza = new BJPizza();
        } else if (type.equals("shanghai")) {
            pizza = new SHPizza();
        } else if (type.equals("hefei")) {

        }
        return pizza;
    }
}
