package com.lhu.mystudy.javamain.myhandler;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by codertiger
 * on Date: 2022/5/21
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class MessageQueue {
    // 阻塞队列
    private BlockingQueue<Message> mBQueue = new ArrayBlockingQueue<>(100);

    /**
     * 将消息放入队列
     * @param msg
     */
    public void enqueueMessage(Message msg) {
        try {
            mBQueue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将message从队列取出
     * @return
     */
    public Message next() {
        Message message = null;
        try {
            message = mBQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }
}
