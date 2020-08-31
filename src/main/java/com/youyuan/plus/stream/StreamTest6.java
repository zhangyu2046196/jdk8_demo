package com.youyuan.plus.stream;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * 类名称：StreamTest6 <br>
 * 类描述： 测试sorted排序 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 14:36<br>
 */
public class StreamTest6 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("随机三个数升序排序");
        random.ints().limit(3).sorted().forEach(System.out::println);
    }

}
