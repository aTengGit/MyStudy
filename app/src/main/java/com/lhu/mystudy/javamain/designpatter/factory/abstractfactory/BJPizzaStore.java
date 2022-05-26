package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;



/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class BJPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        BJPizzaIngredientFactory bjPizzaIngredientFactory = new BJPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(bjPizzaIngredientFactory);
            pizza.setName("准备制作一个北京风味的cheese披萨");
        } else if (item.equals("clam")) {
            pizza = new CheesePizza(bjPizzaIngredientFactory);
            pizza.setName("准备制作一个北京风味的clam的披萨");
        }
        return pizza;
    }
}
