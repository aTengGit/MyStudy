package com.lhu.mystudy.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 *
 * 谷歌在8.0后为了提高效率，删除了静态注册，防止关闭App后广播还在， 造成内存泄漏， 现在静态注册的广播需要指定包名，而动态注册就没有这个问题
 * 无论是静态注册广播 还是动态注册广播，在接收广播的时候都不能拦截广播  否则会报错：
 * BroadcastReceiver trying to return result during a non-ordered broadcast
 */

public class TestBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "TestBroadcastReceiver";
    public static final String BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
    public static final String START_SERVICE = "com.lhu.action.START_SERVICE";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");
        if (null == intent) {
            return;
        }

        String action = intent.getAction();
        Log.d(TAG,"Action: " + action);
        switch (action) {
            case BOOT_COMPLETED:
                Log.d(TAG,"BOOT_COMPLETED11");
                break;
            case START_SERVICE:
                Log.d(TAG,START_SERVICE);
//                context.startService(new Intent(context, MyBinderService.class));
                break;
            default:
                break;
        }
    }
}