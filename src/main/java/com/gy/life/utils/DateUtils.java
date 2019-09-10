package com.gy.life.utils;

import java.text.ParsePosition;
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

    public static Date getDateForString(String time) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strToDate = formatter.parse(time, pos);
        return strToDate;
    }
}
