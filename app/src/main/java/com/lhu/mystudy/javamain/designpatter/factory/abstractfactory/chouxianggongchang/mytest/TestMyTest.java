package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory.chouxianggongchang.mytest;

public class TestMyTest {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("blue");
        color1.fill();
    }
}
