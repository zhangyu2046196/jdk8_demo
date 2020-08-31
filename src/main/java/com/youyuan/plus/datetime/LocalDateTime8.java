package com.youyuan.plus.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 类名称：LocalDateTime8 <br>
 * 类描述： 相差时间合集 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 16:03<br>
 */
public class LocalDateTime8 {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2017, 11, 17);
        LocalDate endDate = LocalDate.of(2018, 01, 05);
        System.out.println("相差月份:"+ ChronoUnit.MONTHS.between(startDate, endDate));
        System.out.println("两月之间的相差的天数   : " + ChronoUnit.DAYS.between(startDate, endDate));
    }

}
