package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class LivingRoomLightOnCommand implements Command{
    Light light;

    public LivingRoomLightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.On();
    }
}
