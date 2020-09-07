package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class OneActivity extends BaseActivity {


    @Override
    public void eventDown() {
        // 判断当手指按下的坐标大于按下图片的坐标时，证明手指按住移动，此时开启书写
        if (x1 >= igvx && x1 <= igvx + (int) (arrdown.getWidth() * scaleWidth)
                && y1 >= igvy & y1 <= igvy + (int) (arrdown.getWidth() * scaleWidth)
        ) {
            type = 1; 					// 开启书写
        } else {
            type = 0; 					// 否则关闭书写
        }
    }

    @Override
    public void eventMove() {
// 下边 是根据比划 以及 手势 做图片的处理 滑动到不同位置 加载不同图片
        if (type == 1) { 					// 如果书写开启
            // 如果手指按下的X坐标大于等于图片的X坐标，或者小于等于缩放图片的X坐标时
            if (x2 >= igvx && x2 <= igvx + (int) (arrdown.getWidth() * scaleWidth)) {
                // 如果当前手指按下的Y坐标小于等于缩放图片的Y坐标，或者大于等于图片的Y坐标时
                if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 && y2 >= igvy) {
                    lodimagep(1);      		// 调用lodimagep()方法，加载第一张显示图片
                }
                // 如果当前手指按下的Y坐标小于等于缩放图片的Y坐标
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 2) {
                    lodimagep(2);            // 调用lodimagep()方法，加载第二张显示图片
                }
                // 如果当前手指按下的Y坐标小于等于缩放图片的Y坐标
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 3) {
                    lodimagep(3);            // 调用lodimagep()方法，加载第三张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 4) {
                    lodimagep(4);            // 调用lodimagep()方法，加载第四张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 5) {
                    lodimagep(5);            // 调用lodimagep()方法，加载第五张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 6) {
                    lodimagep(6);            // 调用lodimagep()方法，加载第六张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 7) {
                    lodimagep(7);            // 调用lodimagep()方法，加载第七张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 8) {
                    lodimagep(8);            // 调用lodimagep()方法，加载第八张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 9) {
                    lodimagep(9);            // 调用lodimagep()方法，加载第九张显示图片
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 10) {
                    lodimagep(10);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 11) {
                    lodimagep(11);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 12) {
                    lodimagep(12);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 13) {
                    lodimagep(13);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 14) {
                    lodimagep(14);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 15) {
                    lodimagep(15);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 16) {
                    lodimagep(16);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 17) {
                    lodimagep(17);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 18) {
                    lodimagep(18);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 19) {
                    lodimagep(19);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 20) {
                    lodimagep(20);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 21) {
                    lodimagep(21);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 22) {
                    lodimagep(22);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 23) {
                    lodimagep(23);
                }
                else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 24) {
                    lodimagep(24);   //加载最后一张图片时，将在lodimagep()方法中调用书写完成对话框
                }
                else {
                    type = 0;         // 手指离开 设置书写关闭
                }

            }
        }
    }

    @Override
    protected String name() {
        String name = "on1_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame1;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg1;
        return bgid;
    }
}
