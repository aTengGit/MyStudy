package com.lhu.mystudy.javamain.designpatter.factory.abstractfactory;

import androidx.annotation.NonNull;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public abstract class Dough {
    String name;

    public Dough() {
        name = "面粉: ";
    }

    @NonNull
    @Override
    public String toString() {
        return name.toString();
    }
}
