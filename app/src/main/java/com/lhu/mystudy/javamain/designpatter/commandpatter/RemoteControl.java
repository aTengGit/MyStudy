package com.lhu.mystudy.javamain.designpatter.commandpatter;

import androidx.annotation.NonNull;

/**
 * Created by codertiger
 * on Date: 2022/5/23
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0 ; i < 7; i++) {
            offCommands[i] = noCommand;
            onCommands[i] = noCommand;
        }
    }

    public void setCommand(int position, Command onCommand, Command offCommand) {
        if (onCommand != null) {
            onCommands[position] = onCommand;
        }
        if (offCommand != null){
            offCommands[position] = offCommand;
        }
    }

    public void onButtonWasPushed(int position) {
        onCommands[position].execute();
    }

    public void offButtonWasPushed(int position) {
        offCommands[position].execute();
    }

    @NonNull
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------ Remote Control ---------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[position " + i + "]" + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }

        return  stringBuffer.toString();
    }
}
