package com.youyuan.plus.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 类名称：LocalDateTime5 <br>
 * 类描述： 测试时间计算 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 15:56<br>
 */
public class LocalDateTime5 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("后5天时间:"+ldt.plusDays(5));
        System.out.println("前5天时间并格式化:"+ldt.minusDays(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("前一个月的时间:"+ldt.minusMonths(1).format(DateTimeFormatter.ofPattern("yyyyMM")));
        System.out.println("后一个月的时间:"+ldt.plusMonths(1));
        System.out.println("指定2099年的当前时间:"+ldt.withYear(2099));
    }

}
