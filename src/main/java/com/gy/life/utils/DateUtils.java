package com.gy.life.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static Date getCurrentTime() {
        Date date = new Date(System.currentTimeMillis());
        return date;
    }

    /**
     *      * 生成时间戳
     *      
     */
    public static String getDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(new Date());
    }
}
