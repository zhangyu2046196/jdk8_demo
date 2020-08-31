package com.youyuan.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author zhangy
 * @version 1.0
 * @description 时间日期api测试，jdk8的时间日期api都是线程安全的
 * @date 2020/2/26 15:32
 */
public class LocalDateTimeTest {

    /**
     * 测试时间:LocalTime
     */
    @Test
    public void test1() {
        LocalTime now = LocalTime.now();//获取当前时间
        System.out.println("当前时间:" + now);
        System.out.println("当前小时:" + now.getHour());
        System.out.println("当前分钟:" + now.getMinute());
        System.out.println("当前秒:" + now.getSecond());

        LocalTime of = LocalTime.of(20, 32, 18);
        System.out.println("指定时间:" + of);
    }

    /**
     * 测试日期:LocalDate
     */
    @Test
    public void test2() {
        LocalDate now = LocalDate.now();//获取当前日期
        System.out.println("当前日期:" + now);
        System.out.println("当前年:" + now.getYear());
        System.out.println("当前月:" + now.getMonth());
        System.out.println("当前日:" + now.getDayOfMonth());

        LocalDate of = LocalDate.of(2019, 12, 8);//指定日期
        System.out.println("指定日期:" + of);
    }

    /**
     * 测试时间日期:LocalDateTime1
     */
    @Test
    public void test3() {
        LocalDateTime now = LocalDateTime.now();//获取当前时间日期
        System.out.println("当前年:" + now.getYear());
        System.out.println("当前月:" + now.getMonth());
        System.out.println("当前日:" + now.getDayOfMonth());
        System.out.println("当前小时:" + now.getHour());
        System.out.println("当前分钟:" + now.getMinute());
        System.out.println("当前秒:" + now.getSecond());

        LocalDateTime of = LocalDateTime.of(2019, 10, 22, 10, 38, 56);//指定日期时间
        System.out.println("指定时间日期:" + of);
    }

    /**
     * 测试时间日期的加减运算
     * <p>
     * 对时间或日期做完加减操作后新返回的LocalDateTime才是计算后的日期和时间
     */
    @Test
    public void test4() {
        LocalDateTime now = LocalDateTime.now();//获取当前时间日期
        System.out.println("当前时间日期:" + now);
        LocalDateTime localDateTime = now.plusHours(2);//当前时间增加两个小时
        System.out.println("当前时间增加两个小时后的日期时间:" + localDateTime);
        LocalDateTime localDateTime1 = now.minusDays(1);//当前时间减一天
        System.out.println("当前时间减一天后的日期时间:" + localDateTime1);
    }
}
