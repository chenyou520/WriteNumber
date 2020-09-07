package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class SevenActivity extends BaseActivity {
    @Override
    public void eventDown() {
        // 以下代码是处理一直按住不放时，定时下移，这样符合操作习惯。
        if (x1 >= igvx
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y1 >= igvy
                & y1 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5) {
            type = 1;
        } else {
            type = 0;
        }
    }

    @Override
    public void eventMove() {
        if (type == 1) {
            if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 2
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(2);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 3
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(3);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 4
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(4);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 5
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(5);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 6
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(6);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 7
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(7);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 8
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(8);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 9
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(9);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 9
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 10
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(10);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 11
                    * 10
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 11 * 11
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 2) {
                lodimagep(13);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 3) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth - (int) (arrdown
                    .getWidth() * scaleWidth) / 25 * 3) / 5)
                    / 13 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 4
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 4) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 5) {
                lodimagep(16);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 6
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 6) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth - (int) (arrdown
                    .getWidth() * scaleWidth) / 25 * 3) / 5)
                    / 13 * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 7
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 7) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 8
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 8) {
                lodimagep(19);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 9
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 9
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 9
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 9) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 10
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 10
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 10
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 10) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 11
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 11
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 11
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 11) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 12
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth) / 25 * 3)
                    / 13 * 12
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 12
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 13 * 12) {
                lodimagep(23);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)) {
                lodimagep(24);
            } else {
                type = 0;
            }
        }
    }

    @Override
    protected String name() {
        String name = "on7_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame7;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg7;
        return bgid;
    }
}
