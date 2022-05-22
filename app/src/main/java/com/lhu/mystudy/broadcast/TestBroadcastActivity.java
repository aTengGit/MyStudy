package com.lhu.mystudy.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.lhu.mystudy.R;

public class TestBroadcastActivity extends AppCompatActivity {
    public static final String TAG = "TestBroadcastActivity";
    public static final String START_SERVICE = "com.lhu.action.START_SERVICE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_broadcast);
        Intent intent = new Intent();
        intent.setAction(START_SERVICE);
        intent.setClassName("com.lhu.mystudy","com.lhu.mystudy.broadcast.TestBroadcastReceiver");
//        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        Log.d(TAG, "onCreate: sendBroadcast: com.lhu.action.START_SERVICE");
    }
}