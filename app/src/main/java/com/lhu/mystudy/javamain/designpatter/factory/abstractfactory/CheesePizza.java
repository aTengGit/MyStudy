package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("准备：" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSough();
        cheese = ingredientFactory.creaseCheese();
        topping = ingredientFactory.createToppings();
        System.out.println("" +sauce);
        System.out.println("" +dough);
        System.out.println("" +cheese);
        System.out.println("添加： ");
        for (int i = 0; i < topping.length; i++) {
            System.out.println("  " +topping[i].names);
        }
    }
}
