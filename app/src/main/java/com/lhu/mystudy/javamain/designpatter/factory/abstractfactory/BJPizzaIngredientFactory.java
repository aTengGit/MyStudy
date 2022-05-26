package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class BJPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ZhongjinDough();
    }

    @Override
    public Sough createSough() {
        return new FanqieSough();
    }

    @Override
    public Cheese creaseCheese() {
        return new MeishiCheese();
    }

    @Override
    public Topping[] createToppings() {
        String[] ll = {"点心","糕点"};
        Topping topping[] = {new Topping(ll)};
        return topping;
    }
}
