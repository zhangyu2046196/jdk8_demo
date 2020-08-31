package com.youyuan.plus.stream;

import java.util.Arrays;

/**
 * 类名称：StreamTest2 <br>
 * 类描述： 测试Stream的mapToInt方法 <br>
 * <p>
 * 求和
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 14:13<br>
 */
public class StreamTest2 {

    public static void main(String[] args) {
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().mapToInt((m) -> m).sum();
        System.out.println("sum:" + sum);
    }

}
