package com.lhu.mystudy.javamain.designpatter.factory.factorymethod.gongchangfangfa;

public class ChinaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{
                new Cappuccino(), new Americano()
        };
    }
}
