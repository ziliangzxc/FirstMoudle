package com.haier.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.haier.firstlib.MsgUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MsgUtils.show(this,"git库测试");
    }
}