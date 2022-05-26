package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sough createSough();
    public Cheese creaseCheese();
    public Topping[] createToppings();
}
