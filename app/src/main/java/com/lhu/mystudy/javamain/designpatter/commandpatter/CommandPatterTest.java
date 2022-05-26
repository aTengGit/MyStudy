package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/25
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class CommandPatterTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LivingRoomLight livingRoomLight = new LivingRoomLight("Living Room");
        KitchenLight kitchenLight = new KitchenLight("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Stereo");

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        LivingRoomLightOnCommand livingRoomLightOnCommand = new LivingRoomLightOnCommand(livingRoomLight);

        remoteControl.setCommand(0,lightOnCommand,null);
        remoteControl.setCommand(1,livingRoomLightOnCommand,null);
        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl);

    }
}
