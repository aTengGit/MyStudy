package com.lhu.mystudy;

import android.util.Log;

/**
 * Created by codertiger
 * on Date: 2022/5/15
 * 要每天多努力一些，比别人多努力一小时
 * -----------------------------
 */
public class LogUtils {
    public static boolean DEBUG = true;

    public static void setDEBUG(boolean debug) {
        DEBUG = debug;
    }

    public static void logdi(String tag, String s) {
        if (DEBUG) {
            Log.i(tag, s);
        }
    }

    public static void logv(String tag, String s) {
        if (DEBUG) {
            Log.v(tag, s);
        }
    }

    public static void logd(String tag, String s) {
        if (DEBUG) {
            Log.d(tag, s);
        }
    }

    public static void logw(String tag, String s) {
        if (DEBUG) {
            Log.w(tag, s);
        }
    }

    public static void loge(String tag, String s) {
        if (DEBUG) {
            Log.e(tag, s);
        }
    }
}
