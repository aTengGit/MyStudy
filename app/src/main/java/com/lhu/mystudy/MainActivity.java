package com.lhu.mystudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lhu.mystudy.broadcast.TestBroadcastActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "MainActivity";
    public static final String START_SERVICE = "com.lhu.action.START_SERVICE";
    private Button mBroadcastBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBroadcastBtn = findViewById(R.id.btn_broadcast);

    }


    @Override
    protected void onStart() {
        super.onStart();
        mBroadcastBtn.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_broadcast:
                Intent intent = new Intent(this,TestBroadcastActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}