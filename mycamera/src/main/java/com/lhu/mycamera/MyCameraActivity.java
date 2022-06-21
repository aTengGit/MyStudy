package com.lhu.mycamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.lhu.mycamera.camera2.Camera2Helper;
import com.lhu.mycamera.view.AutoFitTextureView;

public class MyCameraActivity extends AppCompatActivity {

    AutoFitTextureView mAutoFitTextureView;
    Button mTakePictureBtn;
    Camera2Helper camera2Helper;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycamera);
        mAutoFitTextureView = findViewById(R.id.autoFitTextureView);
        mTakePictureBtn = findViewById(R.id.take);
        mImageView = findViewById(R.id.image_result);
        camera2Helper = new Camera2Helper(this,mAutoFitTextureView, mImageView);
        camera2Helper.init();
    }

    @Override
    protected void onStart() {
        super.onStart();

        mTakePictureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                camera2Helper.takePicture();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        camera2Helper.closeCamera();
    }
}