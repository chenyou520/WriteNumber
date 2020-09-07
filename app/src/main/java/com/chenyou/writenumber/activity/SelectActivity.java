package com.chenyou.writenumber.activity;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.chenyou.writenumber.R;
import com.chenyou.writenumber.numberactivity.EightActivity;
import com.chenyou.writenumber.numberactivity.FiveActivity;
import com.chenyou.writenumber.numberactivity.FourActivity;
import com.chenyou.writenumber.numberactivity.NineActivity;
import com.chenyou.writenumber.numberactivity.OneActivity;
import com.chenyou.writenumber.numberactivity.SevenActivity;
import com.chenyou.writenumber.numberactivity.SixActivity;
import com.chenyou.writenumber.numberactivity.ThreeActivity;
import com.chenyou.writenumber.numberactivity.TwoActivity;
import com.chenyou.writenumber.numberactivity.ZeroActivity;

public class SelectActivity extends Activity implements View.OnClickListener {

    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    private ImageView five;
    private ImageView six;
    private ImageView seven;
    private ImageView eight;
    private ImageView nine;
    private ImageView zero;

    private MediaPlayer mediaPlayer;//定义音乐播放器对象

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2020-09-05 22:03:36 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        six = (ImageView) findViewById(R.id.six);
        seven = (ImageView) findViewById(R.id.seven);
        eight = (ImageView) findViewById(R.id.eight);
        nine = (ImageView) findViewById(R.id.nine);
        zero = (ImageView) findViewById(R.id.zero);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        findViews();
        if (MainActivity.isplay == true) {//如果游戏主界面设置背景音乐为播放音乐状态
            PlayMusic(); //调用播放音乐的方法

        }
    }

    /**
     * 播放背景音乐方法
     */
    private void PlayMusic() {
        //创建音乐播放器对象并加载播放音乐文件
        mediaPlayer = MediaPlayer.create(this, R.raw.number_music);
        mediaPlayer.setLooping(true); //设置音乐循环播放
        mediaPlayer.start();//启动播放音乐
    }

    /**
     * 该方法实现选择数字界面停止时，背景音乐停止
     */
    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {//音乐播放器不为空时
            mediaPlayer.stop();//停止音乐播放
        }
    }

    /**
     * 该方法实现选择数字界面销毁时，背景音乐停止并释放音乐资源
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {//音乐播放器不为空时
            mediaPlayer.stop();//停止音乐播放
            mediaPlayer.release();//释放音乐资源
            mediaPlayer = null;//设置音乐播放器为空
        }
    }

    /**
     * /该方法实现从另一界面返回选择数字界面时，根据音乐播放状态播放音乐
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        if (MainActivity.isplay == true) {//如果音乐处于播放状态
            PlayMusic();//调用播放背景音乐方法，播放音乐
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one://单击事件  进入数字1书写界面
                //当前界面跳转至数字1书写界面
                startActivity(new Intent(SelectActivity.this, OneActivity.class));
                break;
            case R.id.two://单击事件  进入数字2书写界面
                //当前界面跳转至数字2书写界面
                startActivity(new Intent(SelectActivity.this, TwoActivity.class));
                break;
            case R.id.three://单击事件  进入数字3书写界面
                //当前界面跳转至数字3书写界面
                startActivity(new Intent(SelectActivity.this, ThreeActivity.class));
                break;
            case R.id.four://单击事件  进入数字4书写界面
                //当前界面跳转至数字4书写界面
                startActivity(new Intent(SelectActivity.this, FourActivity.class));
                break;
            case R.id.five://单击事件  进入数字5书写界面
                //当前界面跳转至数字5书写界面
                startActivity(new Intent(SelectActivity.this, FiveActivity.class));
                break;
            case R.id.six://单击事件  进入数字6书写界面
                //当前界面跳转至数字6书写界面
                startActivity(new Intent(SelectActivity.this, SixActivity.class));
                break;
            case R.id.seven://单击事件  进入数字7书写界面
                //当前界面跳转至数字7书写界面
                startActivity(new Intent(SelectActivity.this, SevenActivity.class));
                break;
            case R.id.eight://单击事件  进入数字8书写界面
                //当前界面跳转至数字8书写界面
                startActivity(new Intent(SelectActivity.this, EightActivity.class));
                break;
            case R.id.nine://单击事件  进入数字9书写界面
                //当前界面跳转至数字9书写界面
                startActivity(new Intent(SelectActivity.this, NineActivity.class));
                break;
            case R.id.zero://单击事件  进入数字0书写界面
                //当前界面跳转至数字0书写界面
                startActivity(new Intent(SelectActivity.this, ZeroActivity.class));
                break;

        }
    }
}
