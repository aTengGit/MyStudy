package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class SHPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new GaojinDough();
    }

    @Override
    public Sough createSough() {
        return new LaoganmaSough();
    }

    @Override
    public Cheese creaseCheese() {
        return new ZhongshiCheese();
    }

    @Override
    public Topping[] createToppings() {
        String[] ll = {"辣条","冰淇淋"};
        Topping topping[] = {new Topping(ll)};
        return topping;
    }
}
