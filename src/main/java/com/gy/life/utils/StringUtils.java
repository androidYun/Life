package com.gy.life.utils;

import java.text.SimpleDateFormat;
import java.util.Random;

public class StringUtils {

    /**
     * 生成订单编号
     *
     * @return
     */
    public static synchronized String getOrderNo() {
        return DateUtils.getDateTime() + getRandom(4) + "";
    }

    /**
     * 生成固定长度随机码
     *
     * @param n 长度
     */
    private static long getRandom(long n) {
        long min = 1, max = 9;
        for (int i = 1; i < n; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min;
        return rangeLong;
    }

}
