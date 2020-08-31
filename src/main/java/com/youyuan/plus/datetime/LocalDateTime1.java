package com.youyuan.plus.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 类名称：LocalDateTime1 <br>
 * 类描述： 时间日期测试类 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 14:36<br>
 */
public class LocalDateTime1 {

    public static void main(String[] args) {
        //本地日期,不包括时分秒
        LocalDate nowDate = LocalDate.now();
        //本地日期,包括时分秒
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("当前时间:" + nowDate);
        System.out.println("当前时间:" + nowDateTime);
    }

}
