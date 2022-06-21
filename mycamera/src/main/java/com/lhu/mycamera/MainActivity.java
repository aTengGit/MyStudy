package com.lhu.mycamera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lhu.mycamera.utils.PermissionUtils;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button mMyCameraBtn;
    private Button mGoogleCameraBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyCameraBtn = findViewById(R.id.my_camera);
        mGoogleCameraBtn = findViewById(R.id.google_camera);
        mMyCameraBtn.setOnClickListener(this);
        mGoogleCameraBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_camera:
                Intent intent = new Intent(this, MyCameraActivity.class);
                startActivity(intent);
                break;

            case R.id.google_camera:
                Intent intent1 = new Intent(this, GoogleDemoActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        PermissionUtils.getInstance().CheckPermission(this,
                new String[]{Manifest.permission.CAMERA,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE}, new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}