package com.lhu.mystudy.javamain.designpatter.commandpatter;

/**
 * Created by codertiger
 * on Date: 2022/5/25
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("NoCommand..");
    }
}
