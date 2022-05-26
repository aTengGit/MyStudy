package com.lhu.mystudy.javamain.designpatter.singleton;

/**
 * Created by codertiger
 * on Date: 2022/5/22
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class Singleton {

/*

// ***  饿汉模式
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    */

// =============================================
/*
// ***  懒汉模式 （线程不安全）
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    */

// =============================================
/*

// ***  懒汉模式 （线程不安全）
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {      // synchronized
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

*/

// =============================================
/*
// ***  双重检查模式
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {      // synchronized
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    */


// =============================================
// ***  静态内部类
    private Singleton(){}
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }
}
