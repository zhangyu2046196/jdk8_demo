package com.youyuan.plus.datetime;

import java.time.LocalDate;
import java.time.Month;

/**
 * 类名称：LocalDateTime6 <br>
 * 类描述： 创建指定时间 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 15:58<br>
 */
public class LocalDateTime6 {

    public static void main(String[] args) {
        LocalDate ld3 = LocalDate.of(2017, Month.NOVEMBER, 17);
        LocalDate ld4 = LocalDate.of(2018, 02, 11);
        System.out.println("ld3:" + ld3);
        System.out.println("ld4:" + ld4);
    }

}
