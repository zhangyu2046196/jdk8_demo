package com.youyuan.plus.datetime;

import java.time.Duration;
import java.time.Instant;

/**
 * 类名称：LocalDateTime9 <br>
 * 类描述： 精度时间相差 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 16:11<br>
 */
public class LocalDateTime9 {

    public static void main(String[] args) {
        Instant inst1 = Instant.now();
        System.out.println("当前时间戳 : " + inst1);
        Instant inst2 = inst1.plus(Duration.ofSeconds(10));
        System.out.println("增加之后的时间 : " + inst2);
        System.out.println("相差毫秒 : " + Duration.between(inst1, inst2).toMillis());
        System.out.println("相差秒 : " + Duration.between(inst1, inst2).getSeconds());
    }

}
