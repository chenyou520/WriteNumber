package com.chenyou.writenumber.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chenyou.writenumber.R;

/**
 * 关于页面
 */
public class AboutActivity extends Activity {

    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btn_back = (Button) findViewById(R.id.btn_back);
        //实现关闭关于界面返回上一界面
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//关闭关于界面
            }
        });
    }
}
