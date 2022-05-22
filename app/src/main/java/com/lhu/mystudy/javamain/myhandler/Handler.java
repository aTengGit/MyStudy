package com.lhu.mystudy.javamain.myhandler;

/**
 * Created by codertiger
 * on Date: 2022/5/21
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class Handler {
//    Looper mLooper;
    private Looper mLooper;
    private MessageQueue mMessageQueue;

    public Handler() {
        mLooper = Looper.getInstance();
        if (mLooper == null) {
            throw new RuntimeException("Can't create handler inside thread " + Thread.currentThread()
                    + " that has not called Looper.prepare()");
        }
        mMessageQueue = mLooper.mMessageQueue;
    }

    public void sendMessage(Message msg) {
        //指定工作的handler
        msg.target = this;
        //放入消息队列
        mMessageQueue.enqueueMessage(msg);
    }


    public void handleMessage(Message msg) {

    }

    public void dispatchMessage(Message message){
        handleMessage(message);
    }

/**
 * 源码 ：
 * public void dispatchMessage(Message msg) {
 *     if (msg.callback != null) {
 *         //当Message存在回调方法，回调msg.callback.run()方法；
 *         handleCallback(msg);
 *     } else {
 *         if (mCallback != null) {
 *             //当Handler存在Callback成员变量时，回调方法handleMessage()；
 *             if (mCallback.handleMessage(msg)) {
 *                 return;
 *             }
 *         }
 *         //Handler自身的回调方法handleMessage()
 *         handleMessage(msg);
 *     }
 * }
 *
 *
 *  * 当Message的回调方法不为空时，则回调方法msg.callback.run()，其中callBack数据类型为Runnable,否则进入步骤2；
 *  * 当Handler的mCallback成员变量不为空时，则回调方法mCallback.handleMessage(msg),否则进入步骤3；
 *  * 调用Handler自身的回调方法handleMessage()，该方法默认为空，Handler子类通过覆写该方法来完成具体的逻辑。
 */
}
