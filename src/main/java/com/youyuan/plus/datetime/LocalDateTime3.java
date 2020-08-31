package com.youyuan.plus.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 类名称：LocalDateTime3 <br>
 * 类描述： 格式化时间 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 14:44<br>
 */
public class LocalDateTime3 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("格式化时间: "+ ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }

}
