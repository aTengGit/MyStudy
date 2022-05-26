package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class Stereo {
    String name;
    public Stereo(String s) {
        this.name = s;
    }

    public void on() {
        System.out.println(name + " Stereo On..");
    }

    public void off() {
        System.out.println(name + " Stereo off..");
    }

    public void setCD() {
        System.out.println(name + " Stereo setCD..");
    }

    public void setDVD() {
        System.out.println(name + " Stereo setDVD..");
    }

    public void setRadio(String radio) {
        System.out.println(name + " Stereo setRadio.." + radio);
    }
    public void setVolume(int volume) {
        System.out.println(name + " Stereo setVolume.." +volume);
    }
}
