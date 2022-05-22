package com.lhu.mystudy.javamain.myhandler;

/**
 * Created by codertiger
 * on Date: 2022/5/21
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class Looper {

    //线程存储器
    private static final ThreadLocal<Looper> mThreadLocal = new ThreadLocal<>();
    //一个Looper只有一个消息队列
    public MessageQueue mMessageQueue;

    public Looper() {
        mMessageQueue = new MessageQueue();
    }

    /**
     * 创建looper
     */
    public static void prepare() {
        if (mThreadLocal.get() != null) {
            //一个线程只能创建一个Looper
            throw new RuntimeException("Only one Looper may be created per thread");
        }
        mThreadLocal.set(new Looper());
    }

    /**
     * 获取指定线程的Looper实例
     * @return
     */
    public static Looper getInstance() {
        return mThreadLocal.get();
    }

    /**
     * 轮询消息
     */
    public static void loop() {
        Looper looper = getInstance();
        MessageQueue queue = looper.mMessageQueue;
        for (;;) {
            Message message = queue.next();
            if (message != null) {
                message.target.dispatchMessage(message);
            }
        }
    }
}
