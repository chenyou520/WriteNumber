package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class EightActivity extends BaseActivity {
    @Override
    public void eventDown() {
        // 以下代码是处理一直按住不放时，定时下移，这样符合操作习惯。
        if (x1 >= igvx + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27 * 5
                && y1 >= igvy
                & y1 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27 * 5) {
            type = 1;
        } else {
            type = 0;
        }
    }

    @Override
    public void eventMove() {
//					if (type == 1) {
        if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 1
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 1
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 1) {
            lodimagep(2);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 2
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 2
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 2) {
            lodimagep(3);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 3
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 3
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 3) {
            lodimagep(4);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 4
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 4
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 4) {
            lodimagep(5);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 2
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 5
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 5
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 5) {
            lodimagep(6);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 1
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 6
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 6 && i == 7) {
            lodimagep(7);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 2
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 7
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 7 && i == 8) {
            lodimagep(8);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 3
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 8
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 8 && i == 9) {
            lodimagep(9);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 4
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 9
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 9) {
            lodimagep(10);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 5
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 10
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 10) {
            lodimagep(11);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 1
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 11
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 11) {
            lodimagep(12);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 2
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 12
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 12) {
            lodimagep(13);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 3
                && y2 >= igvy
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 13
                & y2 <= igvy
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 13 * 13) {
            lodimagep(14);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 4
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 1
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 1) {
            lodimagep(15);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 5
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 2
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 2) {
            lodimagep(16);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 1
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 3
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 3 && i == 17) {
            lodimagep(17);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 2
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 4
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 4 && i == 18) {
            lodimagep(18);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 3
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 5
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 5 && i == 19) {
            lodimagep(19);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 4
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 4
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 6
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 6 && i == 20) {
            lodimagep(20);
        } else if (x2 >= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 5
                * 5
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                - ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 5 * 5
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 7
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 7) {
            lodimagep(21);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 3
                * 1
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 3 * 1
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 8
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 8) {
            lodimagep(22);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 3
                * 2
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 3 * 2
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 9
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 9 && i == 23) {
            lodimagep(23);
        } else if (x2 >= igvx
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5) / 3
                * 3
                && x2 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                + ((int) (arrdown.getWidth() * scaleWidth) / 2 - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 3 * 3
                && y2 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - (int) (arrdown.getWidth() * scaleWidth)
                / 27
                * 5
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 10
                & y2 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                - ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                .getWidth() * scaleWidth) / 27 * 5)
                / 10 * 10 && i == 24) {
            lodimagep(24);
        } else {
            type = 0;
        }
//					}
    }

    @Override
    protected String name() {
        String name = "on8_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame8;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg8;
        return bgid;
    }
}
