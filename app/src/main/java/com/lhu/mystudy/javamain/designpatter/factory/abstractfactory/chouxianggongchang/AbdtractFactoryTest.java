package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory.chouxianggongchang;

public class AbdtractFactoryTest {
    static void print(Drink drink) {
        if (drink == null) {
            System.out.println("产品: -- ");
        } else {
            System.out.println("产品: " +drink.getName());
        }
    }


    public static void main(String[] args) {
        AbstractDrinkFactory chinaDrinksFactory = new ChinaDrinksFactory();
        Coffee coffee = chinaDrinksFactory.createCoffee();
        Tea tea = chinaDrinksFactory.createTea();
        Sodas sodas = chinaDrinksFactory.createSodas();
        final int DRIVING_REAR_WIDE_VIEW = 0x17;
        System.out.println("中国饮品工厂有如下产品："+DRIVING_REAR_WIDE_VIEW);
        System.out.println("中国饮品工厂有如下产品：");
        print(coffee);
        print(tea);
        print(sodas);

        AbstractDrinkFactory americaDrinksFactory = new AmericaDrinksFactory();
        coffee = americaDrinksFactory.createCoffee();
        tea = americaDrinksFactory.createTea();
        sodas = americaDrinksFactory.createSodas();
        System.out.println("美国饮品工厂有如下产品：");
        print(coffee);
        print(tea);
        print(sodas);
    }
    
}
