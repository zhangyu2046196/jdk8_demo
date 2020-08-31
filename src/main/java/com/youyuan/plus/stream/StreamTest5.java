package com.youyuan.plus.stream;

import java.util.Random;

/**
 * 类名称：StreamTest5 <br>
 * 类描述： 测试limit测试 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 14:32<br>
 */
public class StreamTest5 {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("随机取的三条结果");
        r.ints().limit(3).forEach(System.out::println);
    }

}
