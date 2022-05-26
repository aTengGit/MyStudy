package com.lhu.mystudy.javamain.designpatter.factory.samplefactory.jiandangongchang;

public class SendFactory {
    public Sender produce(String type) {
        if (type == null) {
            return null;
        } else if ("email".equalsIgnoreCase(type)) {
            return new EmailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new  SmsSender();
        } else if ("express".equalsIgnoreCase(type)) {
            return new ExpressSender();
        } else {
            return null;
        }

    }
}
