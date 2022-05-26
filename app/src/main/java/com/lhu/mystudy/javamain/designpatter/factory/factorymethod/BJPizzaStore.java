package com.lhu.mystudy.javamain.designpatter.factory.factorymethod;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class BJPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
       if (type.equals("beijing")) {
           return new BJStyleCheesePizza();
       } else if (type.equals("shanghai")) {
           return new SHStyleCheesePizza();
       } else {
           return null;
       }
    }
}
