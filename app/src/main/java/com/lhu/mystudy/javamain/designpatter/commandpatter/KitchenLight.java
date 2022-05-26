package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class KitchenLight extends Light{
    String name;
    public KitchenLight(String name) {
        this.name = name;
    }

    @Override
    public void On() {
        System.out.println(name + " Light On..");
    }

    @Override
    public void Off() {
        System.out.println(name + " Light Off..");
    }
}
