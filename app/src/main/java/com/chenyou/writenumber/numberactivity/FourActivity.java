package com.chenyou.writenumber.numberactivity;

import android.os.Message;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.chenyou.writenumber.R;

import java.util.Timer;
import java.util.TimerTask;

public class FourActivity extends BaseActivity {
    @Override
    public void eventDown() {
        // 判断当手指按下的坐标大于按下图片的坐标时，证明手指按住移动，此时开启书写
        if (x1 >= igvx + (int) (arrdown.getWidth() * scaleWidth)
                / 28 * 17 - (int) (arrdown.getWidth() * scaleWidth)
                / 28 * 5
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 28 * 17
                && y1 >= igvy
                && y1 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 28 * 5) {
            type = 1;           // 开启书写
        } else if (type == 2) {
        } else {
            type = 0;           // 否则关闭书写
        }
    }

    @Override
    public void eventMove() {
        if (type == 1) {
            if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 1
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 1) {
                lodimagep(2);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 2) {
                lodimagep(3);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 3) {
                lodimagep(4);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 4
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 4) {
                lodimagep(5);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 5) {
                lodimagep(6);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 6
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 6) {
                lodimagep(7);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 7
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 7) {
                lodimagep(8);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 8
                    * 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    - ((int) (arrdown.getWidth() * scaleWidth) / 28 * 17 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 8 * 8
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 8) {
                lodimagep(9);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(10);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 6
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 6 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 6
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 6 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(13);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 6
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 6 * 4
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) / 97 * 74 - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 11)
                    / 8 * 8
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 6
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 6 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5) / 6
                    * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 6 * 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 74
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 74) {
                lodimagep(16);
            } else {
                // type = 0;
            }
        } else if (type == 2) {
            if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 1) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 2) {
                lodimagep(19);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 3) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 4) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 5) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 6) {
                lodimagep(23);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 28
                    * 17
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 17
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 28
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 28 * 5)
                    / 7 * 7) {
                lodimagep(24);
            } else {
                // type = 0;
            }
        }
    }

    @Override
    public void eventUp(ImageView iv_frame, MotionEvent event) {
        x3 = event.getX();
        y3 = event.getY();
        igvx = iv_frame.getLeft();
        igvy = iv_frame.getTop();
        if (i == 17 && type == 1) {
            type = 2;
        } else {
            type = 0;
            if (touchTimer != null) {
                touchTimer.cancel();
                touchTimer = null;
            }
            touchTimer = new Timer();
            touchTimer.schedule(new TimerTask() {
                public void run() {

                    Thread thread = new Thread(new Runnable() {
                        public void run() {
                            // TODO Auto-generated method stub
                            Message message = new Message();
                            message.what = 2;
                            mHandler.sendMessage(message);
                        }
                    });
                    thread.start();
                }
            }, 300, 200);
        }
    }

    @Override
    protected String name() {
        String name = "on4_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame4;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg4;
        return bgid;
    }
}
