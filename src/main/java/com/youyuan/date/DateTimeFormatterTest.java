package com.youyuan.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zhangy
 * @version 1.0
 * @description 时间日期格式化
 * @date 2020/2/27 8:22
 */
public class DateTimeFormatterTest {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("格式化前时间日期" + dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTimeStr = dateTime.format(dateTimeFormatter);
        System.out.println("格式化后时间日期" + dateTimeStr);
    }

}
