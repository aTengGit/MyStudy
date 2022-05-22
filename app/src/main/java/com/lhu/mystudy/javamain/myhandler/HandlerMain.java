package com.lhu.mystudy.javamain.myhandler;

/**
 * Created by codertiger
 * on Date: 2022/5/21
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */


/**
 * 切换到Project工程下.idea/gradle.xml添加属性
 * <option name="delegatedBuild" value="false" />
 * 可以运行main函数
 */



//Message的回调方法：message.callback.run()，优先级最高；
//Handler的回调方法：Handler.mCallback.handleMessage(msg)，优先级仅次于1；
//Handler的默认方法：Handler.handleMessage(msg)，优先级最低。

/**
 * Looper有一个MessageQueue消息队列；
 * MessageQueue有一组待处理的Message；
 * Message中有一个用于处理消息的Handler；
 * Handler中有Looper和MessageQueue。
 */
public class HandlerMain {

    public static void main(String[] args) {

        Looper.prepare();
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                System.out.println(msg.toString());
            }
        };
        handler.sendMessage(new Message("我一点要好好学习"));
        Handler handler1 = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                System.out.println(msg.toString());
            }
        };
        handler1.sendMessage(new Message("我一定要好好学习"));
        Looper.loop();
    }
}
