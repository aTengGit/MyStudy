package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory.chouxianggongchang;

public class ChinaDrinksFactory implements AbstractDrinkFactory {
    @Override
    public Tea createTea() {
        return new MilkTea();
    }

    @Override
    public Sodas createSodas() {
        return null;
    }

    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
