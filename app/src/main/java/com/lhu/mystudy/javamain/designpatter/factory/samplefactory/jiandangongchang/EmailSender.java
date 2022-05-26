package com.lhu.mystudy.javamain.designpatter.factory.samplefactory.jiandangongchang;

public class EmailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("发送邮件");
    }
}
