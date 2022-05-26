package com.lhu.mystudy.javamain.designpatter.factory.factorymethod.gongchangfangfa;

public class AmericaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{
                new Americano(),new Latte()
        };
    }
}
