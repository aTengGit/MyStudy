package com.lhu.mystudy.javamain.designpatter.factory.samplefactory.jiandangongchang;

public class ExpressSender implements Sender {
    @Override
    public void Send() {
        System.out.println("发送快递");
    }
}
