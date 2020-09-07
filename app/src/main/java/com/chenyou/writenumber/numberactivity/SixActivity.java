package com.chenyou.writenumber.numberactivity;

import com.chenyou.writenumber.R;

public class SixActivity extends BaseActivity {
    @Override
    public void eventDown() {
        if (x1 >= igvx + (int) (arrdown.getWidth() * scaleWidth)
                / 25 * 23 - (int) (arrdown.getWidth() * scaleWidth)
                / 5
                && x1 <= igvx
                + (int) (arrdown.getWidth() * scaleWidth)
                / 25 * 23
                && y1 >= igvy
                && y1 <= igvy
                + (int) (arrdown.getHeight() * scaleHeight)
                / 5) {
            type = 1;
            lodimagep(1);
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
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 1
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5

            ) {
                lodimagep(2);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 2
                    && y2 >= igvy
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5

            ) {
                lodimagep(3);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 1

            ) {
                lodimagep(4);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 4
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 2

            ) {
                lodimagep(5);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 5
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 3

            ) {
                lodimagep(6);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 6
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 4 && i == 7

            ) {
                lodimagep(7);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 7
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 5 && i == 8

            ) {
                lodimagep(8);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 8 * 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 25
                    * 23
                    - ((int) (arrdown.getWidth() * scaleWidth) / 25 * 23 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 8 * 8
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 6 && i == 9

            ) {
                lodimagep(9);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 1
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 7

            ) {
                lodimagep(10);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 2
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 8

            ) {
                lodimagep(11);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 3
                    && y2 >= igvy
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 9
                    && y2 <= igvy
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getHeight() * scaleHeight) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 10 * 9

            ) {
                lodimagep(12);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)

            ) {
                lodimagep(13);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 1
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 1) {
                lodimagep(14);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 2) {
                lodimagep(15);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 7
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 7
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 3
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 3) {
                lodimagep(16);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 8
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 8
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 4
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 4) {
                lodimagep(17);
            } else if (x2 >= igvx
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 9 * 9
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    + ((int) (arrdown.getWidth() * scaleWidth) - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 9
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 5
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 5) {
                lodimagep(18);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 1
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 1
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 6
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 6) {
                lodimagep(19);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 2
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 2
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 7
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 7) {
                lodimagep(20);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 3
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 3
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 8
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 8) {
                lodimagep(21);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 4
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 4
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 9
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9 * 9) {
                lodimagep(22);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 5
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 5
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9
                    * 9
                    + ((int) (arrdown.getHeight() * scaleHeight) / 99 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9
                    * 9
                    + ((int) (arrdown.getHeight() * scaleHeight) / 99 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 2 && i == 23) {
                lodimagep(23);
            } else if (x2 >= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5) / 6 * 6
                    && x2 <= igvx
                    + (int) (arrdown.getWidth() * scaleWidth)
                    - ((int) (arrdown.getWidth() * scaleWidth) / 50 * 39 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 6 * 6
                    && y2 >= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - (int) (arrdown.getWidth() * scaleWidth)
                    / 5
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9
                    * 9
                    + ((int) (arrdown.getHeight() * scaleHeight) / 99 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 2 * 2
                    && y2 <= igvy
                    + (int) (arrdown.getHeight() * scaleHeight)
                    - ((int) (arrdown.getHeight() * scaleHeight) / 99 * 67 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 9
                    * 9
                    + ((int) (arrdown.getHeight() * scaleHeight) / 99 * 24 - (int) (arrdown
                    .getWidth() * scaleWidth) / 5)
                    / 2 * 2 && i == 24) {
                lodimagep(24);
            } else {
                // type = 0;
            }
        }
    }

    @Override
    protected String name() {
        String name = "on6_";
        return name;
    }

    @Override
    protected int Id() {
        int id = R.drawable.frame6;
        return id;
    }

    @Override
    protected int bgid() {
        int bgid = R.drawable.bg6;
        return bgid;
    }
}
