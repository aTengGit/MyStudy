package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory.chouxianggongchang;

public interface AbstractDrinkFactory {

    /**
     * 制造咖啡
     * @return
     */
    Coffee createCoffee();


    Tea createTea();


    Sodas createSodas();

}
