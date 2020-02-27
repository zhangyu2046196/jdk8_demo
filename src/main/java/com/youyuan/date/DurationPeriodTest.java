package com.youyuan.date;

import org.junit.Test;

import java.time.*;
import java.util.Random;

/**
 * @author zhangy
 * @version 1.0
 * @description 计算时间和日期的间隔
 * <p>
 * Duration:计算两个时间的间隔
 * Period:计算两个日期的间隔
 * @date 2020/2/26 15:48
 */
public class DurationPeriodTest {

    /**
     * 测试两个时间间隔
     * <p>
     * Duration
     */
    @Test
    public void test1() {
        Instant start = Instant.now();//获取时间戳
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end = Instant.now();//获取时间戳
        Duration between = Duration.between(start, end);
        System.out.println("两个事件间隔相差:" + between);
        System.out.println("两个时间间隔相差:" + between.getSeconds() + "秒");
        System.out.println("两个时间间隔相差:" + between.getNano() + "纳秒");
        System.out.println("两个时间间隔相差:" + between.toMinutes() + "分钟");

        System.out.println("-------------------------");

        LocalTime start1 = LocalTime.now();//获取当前时间
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalTime end1 = LocalTime.now();//获取当前时间
        Duration between1 = Duration.between(start1, end1);
        System.out.println("两个事件间隔相差:" + between1);
        System.out.println("两个时间间隔相差:" + between1.getSeconds() + "秒");
        System.out.println("两个时间间隔相差:" + between1.toMillis() + "毫秒");
        System.out.println("两个时间间隔相差:" + between1.toMinutes() + "分钟");
    }

    /**
     * 计算两个日期的差值
     * <p>
     * Period
     */
    @Test
    public void test2() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.minusMonths(new Random().nextInt(10));
        LocalDate start = localDate1.minusDays(new Random().nextInt(30));
        LocalDate end = LocalDate.now();
        Period between = Period.between(start, end);
        System.out.println("两个日期相差:"+between);
        System.out.println("两个日期相差:"+between.getYears()+"年");
        System.out.println("两个日期相差:"+between.getMonths()+"月");
        System.out.println("两个日期相差:"+between.getDays()+"月");
    }
}
