package com.lhu.mystudy.javamain.designpatter.factory.factorymethod;

import java.util.ArrayList;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();


    void prepare() {
        System.out.println("准备 " + name);
        System.out.println("准备面粉... ");
        System.out.println("准备酱汁... ");
        System.out.println("准备其他小料: ");
        for (int i = 0; i< toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("开始进行烤制，需要15分钟 ");
    }

    void cut() {
        System.out.println("将Pizza进行切片处理 ");
    }

    void box() {
        System.out.println("用专门的门店礼品盒进行包装 ");
    }


    public String getName() {
        return name;
    }
}
