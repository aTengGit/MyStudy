package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory.chouxianggongchang.mytest;

public class FactoryProducer {
    public static AbstractFactory getFactory(String chose) {
        if (chose.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (chose.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
