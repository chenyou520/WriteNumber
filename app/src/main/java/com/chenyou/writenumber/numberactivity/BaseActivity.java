package com.chenyou.writenumber.numberactivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;

import com.chenyou.writenumber.R;
import com.chenyou.writenumber.activity.MainActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;

import util.mCustomProgressDialog;

public abstract class BaseActivity extends Activity {

    public mCustomProgressDialog mdialog;        //定义自定义对话框对象
    MediaPlayer mediaPlayer;    //定义音乐播放器对象
    private ImageView iv_frame;    // 定义显示写数字的ImageView控件
    int i = 1;                    // 图片展示到第几张标记
    float x1;                        // 屏幕按下时的X值
    float y1;                        // 屏幕按下时的y值
    float x2;                        // 屏幕离开时的X值
    float y2;                        // 屏幕离开时的y值
    float x3;                        // 移动中的坐标的X值
    float y3;                        // 移动中的坐标的y值
    int igvx;                        // 图片x坐标
    int igvy;                        // 图片y坐标
    int type = 0;                    // 是否可以书写标识 开关 1开启0关闭
    int widthPixels;                // 屏幕宽度
    int heightPixels;                // 屏幕高度
    float scaleWidth;                // 宽度的缩放比例
    float scaleHeight;            // 高度的缩放比例
    Timer touchTimer = null;        // 点击在虚拟按钮上后用于连续动作的计时器.
    Bitmap arrdown;                // Bitmap图像处理
    boolean typedialog = true;        // dialog对话框状态
    private LinearLayout linearLayout = null;    // LinearLayout线性布局
    private LinearLayout write_layout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        if (MainActivity.isplay == true) {
            PlayMusic();
        }
        initView();

    }

    // 创建演示按钮，单击事件方法
    public void OnYS(View v) {
        if (mdialog == null) {    // 如果自定义对话框为空
            // 实例化自定义对话框，设置显示文字和动画文件
            int anmId = Id();
            mdialog = new mCustomProgressDialog(this, "演示中点击边缘取消", anmId);
        }
        mdialog.show();        // 显示对话框
    }


    private void initView() {
        // 获取显示写数字的ImageView组件
        iv_frame = (ImageView) findViewById(R.id.iv_frame);
        // 获取写数字区域的布局
        linearLayout = (LinearLayout) findViewById(R.id.LinearLayout_show);
        // 获取书写界面布局
        write_layout = (LinearLayout) findViewById(R.id.LinearLayout_number);
        // 设置书写界面布局背景
        int bgid = bgid();
        write_layout.setBackgroundResource(bgid);
        // 获取屏幕宽度
        widthPixels = this.getResources().getDisplayMetrics().widthPixels;
        // 获取屏幕高度
        heightPixels = this.getResources().getDisplayMetrics().heightPixels;
        // 因为图片等资源是按1280*720来准备的，如果是其它分辨率，适应屏幕做准备
        scaleWidth = ((float) widthPixels / 720);
        scaleHeight = ((float) heightPixels / 1280);
        try {
            // 通过输入流打开第一张图片
            String name = name();
            InputStream is = getResources().getAssets().open(name + "1.png");
            // 使用Bitmap解析第一张图片
            arrdown = BitmapFactory.decodeStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取布局的宽高信息
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv_frame.getLayoutParams();
        // 获取图片缩放后宽度
        layoutParams.width = (int) (arrdown.getWidth() * scaleHeight);
        // 获取图片缩放后高度
        layoutParams.height = (int) (arrdown.getHeight() * scaleHeight);
        // 根据图片缩放后的宽高，设置iv_frame的宽高
        iv_frame.setLayoutParams(layoutParams);
        // 调用lodimagep()方法，进入页面后加载第一个图片
        lodimagep(1);
        //设置手势判断事件
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {//手势按下判断的onTouch()方法
                switch (event.getAction()) {// 获取行动方式头部
                    case MotionEvent.ACTION_DOWN:// 手指按下事件
                        // 当手指按下的时候坐标
                        x1 = event.getX(); // 获取手指按下的X坐标
                        y1 = event.getY(); // 获取手指按下的Y坐标
                        igvx = iv_frame.getLeft();  // 获取手指按下图片的X坐标
                        igvy = iv_frame.getTop(); // 获取手指按下图片的Y坐标
                        eventDown();
                        break;

                    case MotionEvent.ACTION_MOVE:// 手势移动中判断
                        igvx = iv_frame.getLeft();// 获取图片的X坐标
                        igvy = iv_frame.getTop();// 获取图片的Y坐标
                        x2 = event.getX();// 获取移动中手指在屏幕X坐标的位置
                        y2 = event.getY();// 获取移动中手指在屏幕Y坐标的位置
                        // 下边 是根据比划 以及 手势 做图片的处理 滑动到不同位置 加载不同图片
                        eventMove();
                        break;
                    case MotionEvent.ACTION_UP:// 手势抬起判断
                        eventUp(iv_frame, event);
                        break;
                }
                return true;
            }
        });
    }


    public void eventUp(ImageView iv_frame, MotionEvent event) {
        type = 0;// 手势关闭
        // 当手指离开的时候
        if (touchTimer != null) {// 判断计时器是否为空
            touchTimer.cancel();// 中断计时器
            touchTimer = null;// 设置计时器为空
        }
        touchTimer = new Timer();
        touchTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Message message = new Message();
                        message.what = 2;// message消息为2
                        mHandler.sendMessage(message);
                    }
                });
                thread.start();// 开启线程
            }
        }, 300, 200);// 设置0.3秒后执行定时器，定时器每0.2秒发送一次
    }

    /**
     * 所要加载的图片的名字,例如："on1_"
     *
     * @return
     */
    protected abstract String name();

    /**
     * 所要演示的数字动画id
     *
     * @return
     */
    protected abstract int Id();

    /**
     * 界面布局背景
     *
     * @return
     */
    protected abstract int bgid();

    /**
     * 当手指按下时开始书写数字的方法
     */
    public abstract void eventDown();

    /**
     * 当手指移动式书写数字的方法
     */
    public abstract void eventMove();


    //递减显示帧图片的handler消息
    public Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 2:
                    jlodimage();    // 调用资源图片倒退显示方法
                    break;
                default:
                    break;
            }
        }
    };

    //当手势抬起时数字资源图片倒退显示jlodimage()方法
    private void jlodimage() {
        if (i == 25) {// 如果当前图片位置等于25
        } else if (i < 25) {// 否则如果当前图片小于25
            if (i > 1) {// 如果当前图片大于1
                i--;// 否则如果当前图片等于1
            } else if (i == 1) {
                i = 1;
                if (touchTimer != null) {// 判断计时器是否为空
                    touchTimer.cancel();// 中断计时器
                    touchTimer = null;// 设置计时器为空
                }
            }
            String name = name() + i;
            // 获取图片资源
            int imgid = getResources().getIdentifier(name, "drawable",
                    "com.chenyou.writenumber");
            // 给imageview设置图片
            iv_frame.setBackgroundResource(imgid);
        }

    }

    public synchronized void lodimagep(int j) {
        i = j;// 当前图片位置
        if (i < 25) {// 如果当前图片位置小于25
            // 当前图片名称
            String name = name() + i;
            int imgid = getResources().getIdentifier(name, "drawable", "com.chenyou.writenumber");
            // 设置图片
            iv_frame.setBackgroundResource(imgid);
            i++;
        }
        if (j == 24) {// 如果当前图片位置为24
            if (typedialog) {// 没有对话框的情况下
                dialog();// 调用书写完成对话框方法
            }
        }
    }

    /**
     * 完成后提示对话框头部
     */
    private void dialog() {
        typedialog = false;// 修改对话框状态
        // 实例化对话框
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
        builder.setMessage("太棒了！书写完成！");// 设置对话框文本信息
        builder.setTitle("提示");// 设置对话框标题
        //设置对话框完成按钮单击事件
        builder.setPositiveButton("完成", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();// dialog消失
                typedialog = true;// 修改对话框状态
                finish();// 关闭当前页面
            }
        });
        //设置对话框再来一次按钮单击事件
        builder.setNegativeButton("再来一次", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();// dialog消失
                typedialog = true;// 修改对话框状态
                i = 1;
                lodimagep(i);// 调用加载图片方法中的第一张图片
            }
        });
        // 创建并显示对话框
        builder.create().show();
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
     * 该方法实现数字1书写界面停止时，背景音乐停止
     */
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {        //音乐播放器不为空时
            mediaPlayer.stop();            //停止音乐播放
        }
    }

    /**
     * 该方法实现数字1书写界面销毁时，背景音乐停止并释放音乐资源
     */
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {        //音乐播放器不为空时
            mediaPlayer.stop();                //停止音乐播放
            mediaPlayer.release();            //释放音乐资源
            mediaPlayer = null;                //设置音乐播放器为空
        }
    }

}