package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;



/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class SHPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        SHPizzaIngredientFactory shPizzaIngredientFactory = new SHPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(shPizzaIngredientFactory);
            pizza.setName("准备制作一个上海风味的cheese披萨");
        } else if (item.equals("clam")) {
            pizza = new CheesePizza(shPizzaIngredientFactory);
            pizza.setName("准备制作一个上海风味的clam披萨");
        }
        return pizza;
    }
}
