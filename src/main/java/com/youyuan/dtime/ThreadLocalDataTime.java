package com.youyuan.dtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author zhangy
 * @version 1.0
 * @description 通过ThreadLoal保证线程安全
 * @date 2020/2/26 12:13
 */
public class ThreadLocalDataTime {

    public static final ThreadLocal<DateFormat> sdf = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };


}
