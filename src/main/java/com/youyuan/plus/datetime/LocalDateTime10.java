package com.youyuan.plus.datetime;

import java.time.LocalDateTime;

/**
 * 类名称：LocalDateTime10 <br>
 * 类描述： 时间大小比较 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 16:15<br>
 */
public class LocalDateTime10 {

    public static void main(String[] args) {
        LocalDateTime ldt4 = LocalDateTime.now();
        LocalDateTime ldt5 = ldt4.plusMinutes(10);
        System.out.println("当前时间是否大于:"+ldt4.isAfter(ldt5));
        System.out.println("当前时间是否小于"+ldt4.isBefore(ldt5));
    }

}
