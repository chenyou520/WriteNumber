package com.chenyou.writenumber.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chenyou.writenumber.R;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnPlay;
    private Button btnMusic;
    private Button btnAbout;

    private MediaPlayer mediaPlayer; //定义音乐播放器对象
    public static boolean isplay = true;//设置音乐播放状态变量


    private void findViews() {
        btnPlay = (Button) findViewById(R.id.btn_play);
        btnMusic = (Button) findViewById(R.id.btn_music);
        btnAbout = (Button) findViewById(R.id.btn_about);

        btnPlay.setOnClickListener(this);
        btnMusic.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnPlay) {//单击事件 进入选择数字界面
            //当前界面跳转至选择数字界面
            startActivity(new Intent(MainActivity.this, SelectActivity.class));

        } else if (v == btnMusic) {//单击事件  音乐播放时单击按钮停止音乐播放，音乐停止时单击按钮播放音乐
            if (isplay == true) {//如果音乐处于播放状态
                if (mediaPlayer != null) {//音乐播放器不为空时
                    mediaPlayer.stop();//停止音乐播放
                    //设置按钮为停止状态背景
                    btnMusic.setBackgroundResource(R.drawable.btn_music2);
                    isplay = false; //设置音乐处于停止状态
                }
            } else { //如果音乐处于停止状态
                PlayMusic();//调用播放背景音乐方法，播放音乐
                //设置按钮为播放状态背景
                btnMusic.setBackgroundResource(R.drawable.btn_music1);
                isplay = true;//设置音乐处于播放状态
            }

        } else if (v == btnAbout) {//单击事件  进入关于界面
            //当前界面跳转至关于界面
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        //调用播放音乐的方法
        PlayMusic();
    }

    private void PlayMusic() {//播放背景音乐方法
        //创建音乐播放器对象并加载播放音乐文件
        mediaPlayer = MediaPlayer.create(this, R.raw.main_music);
        mediaPlayer.setLooping(true);//设置音乐循环播放
        mediaPlayer.start();//启动播放音乐
    }

    /**
     * 该方法实现从另一界面返回游戏主界面时，根据音乐播放状态播放音乐
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        if (isplay == true) {//如果音乐处于播放状态
            PlayMusic();//调用播放背景音乐方法，播放音乐
        }
    }

    /**
     * 该方法实现游戏主界面停止时，背景音乐停止
     */
    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {//音乐播放器不为空时
            mediaPlayer.stop();//停止音乐播放
        }
    }

    /**
     * 该方法实现游戏主界面销毁时，背景音乐停止并释放音乐资源
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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
