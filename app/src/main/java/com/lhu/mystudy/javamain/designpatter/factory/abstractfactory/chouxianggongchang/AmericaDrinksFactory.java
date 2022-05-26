package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory.chouxianggongchang;

public class AmericaDrinksFactory implements AbstractDrinkFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Tea createTea() {
        return null;
    }

    @Override
    public Sodas createSodas() {
        return new CocaCola();
    }
}
