package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class TwoActivity extends BaseActivity {

    @Override
    public void eventDown() {
        // 判断当手指按下的坐标大于按下图片的坐标时，证明手指按住移动，此时开启书写
        if (x1 >= igvx && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y1 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 3
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y1 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 3) {
            type = 1;   // 开启书写
        } else {
            type = 0;   // 否则关闭书写
        }
    }

    @Override
    public void eventMove() {
        // 下边 是根据比划 以及 手势 做图片的处理 滑动到不同位置 加载不同图片
        if (type == 1) {
            if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3) {
                lodimagep(2);   // 调用lodimagep()方法，加载第二张显示图片
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15) {
                lodimagep(3);  // 调用lodimagep()方法，加载第三张显示图片
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15 * 2) {
                lodimagep(4);  // 调用lodimagep()方法，加载第四张显示图片
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15 * 3) {
                lodimagep(5);  // 调用lodimagep()方法，加载第五张显示图片
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 6
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 15 * 4) {
                lodimagep(6);  // 调用lodimagep()方法，加载第六张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 1) {
                lodimagep(7);  // 调用lodimagep()方法，加载第七张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 2) {
                lodimagep(8);  // 调用lodimagep()方法，加载第八张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 3) {
                lodimagep(9);  // 调用lodimagep()方法，加载第九张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 12 * 4) {
                lodimagep(10);  // 调用lodimagep()方法，加载第十张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 2) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 3) {
                lodimagep(13);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 4) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 5) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 6) {
                lodimagep(16);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 7
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 7) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 8
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 8) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 10 * 9
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 9
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 9) {
                lodimagep(19);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 3 * 2 / 10 * 9
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(23);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth) / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(24);  //加载最后一张图片时，将在lodimagep()方法中调用书写完成对话框
            }
        }
    }

    @Override
    protected String name() {
        String name = "on2_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame2;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg2;
        return bgid;
    }
}
