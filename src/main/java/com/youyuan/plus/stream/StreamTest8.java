package com.youyuan.plus.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 类名称：StreamTest8 <br>
 * 类描述： parallelStream并行处理 <br>
 * <p>
 * 测试并行处理流获取空字符串的个数
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 21:18<br>
 */
public class StreamTest8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "", "c", "", "e", "");
        long count = list.parallelStream().filter((f) -> f.isEmpty()).count();
        System.out.println("count:" + count);
    }

}
