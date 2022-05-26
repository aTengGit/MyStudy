package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.Off();
    }
}
