package com.lhu.mycamera.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

/**
 * Author : CoderTiger
 * Date : 2022/5/31
 * 要每天多努力一些，比别人多努力一小时
 * Desc :
 * -----------------------------
 */
public class PermissionUtils {
    public static final String TAG = "PermissionUtils";

    private final int  PERMISSION_REQUEST_CODE = 100;
    private final int PERMISSION_SETTING_CODE = 101;

    private  AlertDialog permissionExplainDialog = null;
    private AlertDialog permissionSettingDialog = null;

    public static PermissionUtils getInstance(){
        return PermissionUtilsHolder.instance;
    }
    private static class PermissionUtilsHolder {
        public static final PermissionUtils instance = new PermissionUtils();
    }


    /**
     * 第一步检查
     * @param activity
     * @param permissionList
     * @param callback
     */
    public void CheckPermission(Activity activity, String[] permissionList, Runnable callback) {
        boolean allGranted = true;
                
        for (String s : permissionList) {
            int checkSelfPermission = ContextCompat.checkSelfPermission(activity, s);
            Log.d(TAG, "CheckPermission: 检查权限 :" + s + "-> 结果 :" +checkSelfPermission);
            
            if (checkSelfPermission != PackageManager.PERMISSION_GRANTED) {
                allGranted = false;
                Log.d(TAG, s+" 没有权限: ");
            }
        }

        if (allGranted) {   //拥有全部权限
            callback.run();
        } else {   //申请权限
            startRequestPermission(activity, permissionList);
        }
    }

    /**
     *第二步，如果用户之前拒绝过，展示需要权限的提示框，否则的话直接请求相关权限
     *
     * @param activity
     * @param permissionList
     */
    private void startRequestPermission(Activity activity, String[] permissionList) {

        for (String s : permissionList) {
            /**
             * shouldShowRequestPermissionRationale
             * 如果应用之前请求过该权限但用户拒绝了该方法就会返回true
             *
             * 如果用户之前拒绝了权限请求并且勾选了权限请求对话框的”不再询问”，该方法会返回false，
             * 如果设备策略禁止该应用获得该权限也会返回false
             *
             */
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, s)) {
                // 向用户显示一个解释，要以异步非阻塞的方式
                // 该线程将等待用户响应！等用户看完解释后再继续尝试请求权限
                Log.d(TAG, "showPermissionExplainDialog: ");
                showPermissionExplainDialog(activity, permissionList);
            } else {
                /**
                 * 当你的应用调用requestPermissions()方法时，系统会向用户展示一个标准对话框，
                 * 你的应用不能修改也不能自定义这个对话框，如果你需要给用户一些额外的信息和解释你就需要在
                 * 调用requestPermissions()之前像上面一样" 解释为什么应用需要这些权限"
                 */
                Log.d(TAG, "startRequestPermission: ");
                requestPermission(activity, permissionList);
            }
        }
    }

    /**
     *  不需要向用户解释了，我们可以直接请求该权限
     *  第三步. 请求权限
     * @param activity
     * @param permissionList
     */
    private void requestPermission(Activity activity, String[] permissionList) {
        ActivityCompat.requestPermissions(activity, permissionList, PERMISSION_REQUEST_CODE);
    }

    /**
     * 当用户之前拒绝过，展示一个对话框，解释为什么需要此权限
     * @param activity
     * @param permissionList
     */
    private void showPermissionExplainDialog(Activity activity, String[] permissionList) {
        
        if (permissionExplainDialog == null) {
            permissionExplainDialog = new AlertDialog.Builder(activity).setTitle("申请权限")
                    .setMessage("您刚才拒绝了相关权限，但是现在应用需要这个权限，" +
                            "点击确定申请权限，点击取消将无法使用该功能")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Log.d(TAG, "onClick: dialogInterface");
                            requestPermission(activity,permissionList);
                            permissionExplainDialog.cancel();
                        }
                    })
                    .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            permissionExplainDialog.cancel();
                        }
                    }).create();
        }
        permissionExplainDialog.show();

    }

}

