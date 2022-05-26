package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class GarageDoor {

    String name;
    public GarageDoor(String name) {
        this.name = name;
    }
    public void open() {
        System.out.println(name + " GarageDoor open..");
    }
    public void unopen() {
        System.out.println(name + " GarageDoor unopen..");
    }
}
