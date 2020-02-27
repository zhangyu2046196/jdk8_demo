package com.youyuan.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试时间校正器
 * @date 2020/2/27 7:38
 */
public class TemporalAdjusterTest {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();//获取当前时间日期

        //1、获取下一个周日
        LocalDateTime ld1 = dateTime.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("下一个周日是:" + ld1);

        //2、获取下一个月的1号
        LocalDateTime ld2 = dateTime.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("下一个月第一天是:" + ld2);

        //3、自定义时间校正器，获取下一个工作日
        LocalDateTime nextWeek = dateTime.with((l) -> {
            LocalDateTime localDateTime = (LocalDateTime) l;
            if (localDateTime.equals(TemporalAdjusters.next(DayOfWeek.FRIDAY))) {
                return localDateTime.plusDays(3);
            } else if (localDateTime.equals(TemporalAdjusters.next(DayOfWeek.SATURDAY))) {
                return localDateTime.plusDays(2);
            } else {
                return localDateTime.plusDays(1);
            }
        });
        System.out.println("下一个工作日:" + nextWeek);
    }

}
