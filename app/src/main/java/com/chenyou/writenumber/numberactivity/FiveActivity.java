package com.chenyou.writenumber.numberactivity;

import android.os.Message;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.chenyou.writenumber.R;

import java.util.Timer;
import java.util.TimerTask;

public class FiveActivity extends BaseActivity {
    @Override
    public void eventDown() {
        if (x1 >= igvx
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 24 * 5
                && y1 >= igvy
                && y1 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 24 * 5) {
            type = 1;
        } else if (type == 2) {
        } else {
            type = 0;
        }
    }

    @Override
    public void eventMove() {
        if (type == 1) {
            if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 2) {
                lodimagep(2);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 3) {
                lodimagep(3);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 4) {
                lodimagep(4);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 5) {
                lodimagep(5);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 6) {
                lodimagep(6);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 7) {
                lodimagep(7);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 5
                    * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 5 * 1
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 53 / 7 * 6 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 2

                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 53
                    / 7
                    * 7
                    - ((int) (arrdown.getHeight() * scaleHeight) / 97 * 31 + (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 2) {
                lodimagep(8);

            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 5
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 5 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31

                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5) {
                lodimagep(9);

            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 5
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 5 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 7 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 1) {

                lodimagep(10);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 5
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 5 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 7 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 2) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth) / 24
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 7 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 3) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 1

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 7 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 4) {
                lodimagep(13);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 2

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 7 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 5) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 3

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 - (int) (arrdown
                    .getHeight() * scaleHeight) / 97 * 31)
                    / 7 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 97
                    * 31
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 97 * 31 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 6) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 4

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(16);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 5

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 485 * 131 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 3 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 485 * 131 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 3 * 1) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 6

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 485 * 131 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 3 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 485 * 131 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 3 * 2) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 7
                    * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 7 * 7

                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 485 * 131 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 3 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 485 * 131 - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 3 * 3) {
                lodimagep(19);
            } else {

            }
        } else if (type == 2) {
            if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 24
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5 * 2

                    && y1 >= igvy
                    && y1 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 4
                    * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    * 2
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 4 * 1
                    && y1 >= igvy
                    && y1 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 4
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    * 2
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 4 * 2
                    && y1 >= igvy
                    && y1 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 4
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    * 2
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 4 * 3
                    && y1 >= igvy
                    && y1 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5) {
                lodimagep(23);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5) / 4
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24
                    * 5
                    * 2
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 24 * 5)
                    / 4 * 4
                    && y1 >= igvy
                    && y1 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 24 * 5) {
                lodimagep(24);
            } else {
                // type = 0;
            }
        }
    }

    @Override
    public void eventUp(ImageView iv_frame, MotionEvent event) {
        // 当手指离开的时候
        x3 = event.getX();
        y3 = event.getY();
        igvx = iv_frame.getLeft();
        igvy = iv_frame.getTop();
        if (i == 20 && type == 1) {
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
        String name = "on5_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame5;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg5;
        return bgid;
    }
}
