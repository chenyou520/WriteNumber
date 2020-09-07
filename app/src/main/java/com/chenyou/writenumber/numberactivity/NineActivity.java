package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class NineActivity extends BaseActivity {
    @Override
    public void eventDown() {
        if (x1 >= igvx + (int) (arrdown.getWidth() * scaleWidth)
                / 25 * 24 - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 25 * 24
                && y1 >= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 49 * 11
                - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && y1 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 49 * 11) {
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
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 1
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 / 3 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 3 * 1) {
                lodimagep(2);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 / 3 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 3 * 2) {
                lodimagep(3);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 / 3 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 3 * 3) {
                lodimagep(4);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 1) {
                lodimagep(5);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 2) {
                lodimagep(6);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 3) {
                lodimagep(7);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 7 * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 7 * 7
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 4) {
                lodimagep(8);

            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2) / 5
                    * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2)
                    / 5 * 1
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 5) {
                lodimagep(9);

            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2) / 5
                    * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2)
                    / 5 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 6) {

                lodimagep(10);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2) / 5
                    * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2)
                    / 5 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 30 / 7 * 7) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2) / 5
                    * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2)
                    / 5 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 30
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 30 - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 22)
                    / 2

                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 30
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 30 - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 22)
                    / 2) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2) / 5
                    * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5 * 2)
                    / 5 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 30
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 30 - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 22)
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 30
                    - ((int) (arrdown.getHeight() * scaleHeight) / 49 * 30 - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 22)) {
                lodimagep(13);

            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 24
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 1 && i == 14) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 24
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 2 && i == 15) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 24
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 3) {
                lodimagep(16);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 24
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 4) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 24
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 5) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25 * 24
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 6) {
                lodimagep(19);

            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 1
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 8) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 9
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 9) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 10
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 10) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 10
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 10 && i == 23) {
                lodimagep(23);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth) / 25
                    * 24 - (int) (arrdown.getWidth() * scaleWidth)
                    / 5 - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 24
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 10 * 9 / 5 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getHeight() * scaleHeight)
                    / 49 * 11 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 10
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    / 49
                    * 11
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getHeight() * scaleHeight) / 49 * 11)
                    / 10 * 10 && i == 24) {
                lodimagep(24);
            } else {
                // type = 0;
            }

        }
    }

    @Override
    protected String name() {
        String name = "on9_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame9;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg9;
        return bgid;
    }
}
