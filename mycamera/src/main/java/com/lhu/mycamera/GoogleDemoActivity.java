package com.lhu.mycamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lhu.mycamera.camera2.Camera2BasicHelper;

public class GoogleDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicHelper.newInstance())
                    .commit();
        }
    }
}