package com.gy.life.utils;

import java.util.UUID;

public class UUIDUtils {
    /**
     * 获得一个UUID
     *
     * @return String UUID
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }

    /**
     * 获取16位随机字符串
     *
     * @return String
     */
    public static String getMerchantNo() {
        String uuid = UUID.randomUUID().toString();
        char[] cs = new char[32];
        char c = 0;
        for (int i = uuid.length() / 2, j = 1; i-- > 0; ) {
            if ((c = uuid.charAt(i)) != '-') {
                cs[j++] = c;
            }
        }
        String uid = String.valueOf(cs);
        return "sh" + uid;
    }
}
