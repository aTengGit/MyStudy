package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

import androidx.annotation.NonNull;

import java.util.ArrayList;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sough sauce;
    Cheese cheese;
    Topping topping[];

    abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
