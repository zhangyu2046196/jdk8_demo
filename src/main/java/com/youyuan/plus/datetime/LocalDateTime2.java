package com.youyuan.plus.datetime;

import java.time.LocalDateTime;

/**
 * 类名称：LocalDateTime2 <br>
 * 类描述： 获取年、月、日、时、分、秒 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 14:40<br>
 */
public class LocalDateTime2 {

    public static void main(String[] args) {
        //获取当前的时间，包括毫秒
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("当前年:"+ldt.getYear());
        System.out.println("当前年份天数:"+ldt.getDayOfYear());
        System.out.println("当前月:"+ldt.getMonthValue());
        System.out.println("当前日:"+ldt.getDayOfMonth());
        System.out.println("当前周:"+ldt.getDayOfWeek());
        System.out.println("当前时:"+ldt.getHour());
        System.out.println("当前分:"+ldt.getMinute());
        System.out.println("当前时间:"+ldt.toString());
    }

}
