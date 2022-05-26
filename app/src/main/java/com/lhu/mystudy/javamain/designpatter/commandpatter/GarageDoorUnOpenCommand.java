package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class GarageDoorUnOpenCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorUnOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.unopen();
    }
}
