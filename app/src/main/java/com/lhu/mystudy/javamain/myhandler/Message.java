package com.lhu.mystudy.javamain.myhandler;

/**
 * Created by codertiger
 * on Date: 2022/5/21
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class Message {
    Object object;
    int what;
    Handler target;

    public Message(Object obj){
        object = obj;
    }

    public String toString() {
        return object.toString();
    }
}
