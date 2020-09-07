package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class ZeroActivity extends BaseActivity {
    @Override
    public void eventDown() {
        // 以下代码是处理一直按住不放时，定时下移，这样符合操作习惯。
        if (x1 >= igvx + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
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
        if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 5 * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 5
                * 1
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 2
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 2) {
            lodimagep(2);
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
                .getWidth() * scaleWidth) / 5) / 5
                * 2
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 3
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 3) {
            lodimagep(3);
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
                .getWidth() * scaleWidth) / 5) / 5
                * 3
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 4
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 4) {
            lodimagep(4);
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
                .getWidth() * scaleWidth) / 5) / 5
                * 4
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 5
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 5) {
            lodimagep(5);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth) / 2
                - (int) (arrdown.getWidth() * scaleWidth) / 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 6
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 6) {
            lodimagep(6);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)

                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 7
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 7) {
            lodimagep(7);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 2
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 8
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 8) {
            lodimagep(8);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 3
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 9
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 9) {
            lodimagep(9);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 4
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 10
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 10) {
            lodimagep(10);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 5
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 11
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 11) {
            lodimagep(11);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth) / 2
                - (int) (arrdown.getWidth() * scaleWidth) / 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)) {
            lodimagep(12);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 1
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 1
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 1) {
            lodimagep(13);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 2
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 2
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 2) {
            lodimagep(14);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 3
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 3
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 3) {
            lodimagep(15);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 4
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 4
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 4) {
            lodimagep(16);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                - ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 5
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5

                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 5
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 5) {
            lodimagep(17);
        } else if (x2 >= igvx
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 6
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 6) {
            lodimagep(18);
        } else if (x2 >= igvx

                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 1
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 7
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 7) {
            lodimagep(19);
        } else if (x2 >= igvx

                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 2
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 8
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 8) {
            lodimagep(20);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 3
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 9
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 9) {
            lodimagep(21);
        } else if (x2 >= igvx

                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 4
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 10
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 10 && i == 22) {
            lodimagep(22);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6 * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 6
                * 5
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 11
                && y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 5) / 12
                * 11 && i == 23) {
            lodimagep(23);
        } else if (x2 >= igvx

                - (int) (arrdown.getWidth() * scaleWidth) / 5
                && x2 < igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                && y2 >= igvy
                && y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 5 && i == 24) {
            lodimagep(24);
        } else {
            type = 0;
        }
    }

    @Override
    protected String name() {
        String name = "on0_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame0;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg9;
        return bgid;
    }
}
