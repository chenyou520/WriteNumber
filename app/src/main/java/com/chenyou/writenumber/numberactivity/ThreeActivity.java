package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class ThreeActivity extends BaseActivity {
    @Override
    public void eventDown() {
        // 判断当手指按下的坐标大于按下图片的坐标时，证明手指按住移动，此时开启书写
        if (x1 >= igvx
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y1 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 4
                - (int) (arrdown.getWidth() * scaleWidth)
                / 16
                && y1 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 4) {
            type = 1;      // 开启书写
            lodimagep(1);
        } else {
            type = 0;      // 否则关闭书写
        }
    }

    @Override
    public void eventMove() {
        // 下边 是根据比划 以及 手势 做图片的处理 滑动到不同位置 加载不同图片
        if (type == 1) {
            if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 16 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 16 * 1) {
                lodimagep(2);  // 调用lodimagep()方法，加载第二张显示图片
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 16 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 16 * 2) {
                lodimagep(3);  // 调用lodimagep()方法，加载第三张显示图片
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 4 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 16 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 16 * 3) {
                lodimagep(4);  // 调用lodimagep()方法，加载第四张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(5);  // 调用lodimagep()方法，加载第五张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15) {
                lodimagep(6);  // 调用lodimagep()方法，加载第六张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth) / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 2) {
                lodimagep(7);  // 调用lodimagep()方法，加载第七张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 3) {
                lodimagep(8);  // 调用lodimagep()方法，加载第八张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 3 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 3 * 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 4) {
                lodimagep(9);  // 调用lodimagep()方法，加载第九张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 3 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 3 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 5) {
                lodimagep(10);  // 调用lodimagep()方法，加载第十张显示图片
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5

                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 6) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 7) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 5 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 5 * 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 8) {
                lodimagep(13);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 5 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 5 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 9
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 9) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 5 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 2
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 5 * 4
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 10
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 10) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth) / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 11
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 11) {
                lodimagep(16);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 12
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 12) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 13
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 13) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 14
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 15 * 14) {
                lodimagep(19);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5

                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 4 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 4 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 4 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 4 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 2) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 7
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 4 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 4 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 4 * 3) {
                lodimagep(23);
            } else if (x2 >= igvx
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 4
                    * 3
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(24);  //加载最后一张图片时，将在lodimagep()方法中调用书写完成对话框
            }
        }
    }

    @Override
    protected String name() {
        String name = "on3_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame3;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg3;
        return bgid;
    }
}
