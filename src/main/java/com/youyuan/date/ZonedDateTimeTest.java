package com.youyuan.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试时区类
 * @date 2020/2/27 8:24
 */
public class ZonedDateTimeTest {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("当前时间:" + dateTime);

        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("America/Puerto_Rico"));//显示相差小时数
        System.out.println("转换时区时间:" + zonedDateTime);

        ZonedDateTime jst = dateTime.atZone(ZoneId.of(ZoneId.SHORT_IDS.get("JST")));//显示相差的小时数
        System.out.println("转换时区时间:" + jst);

        LocalDateTime eat = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("EAT")));
        System.out.println("直接获取指定时区时间:" + eat);
    }

}
