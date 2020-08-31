package com.youyuan.plus.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 类名称：StreamTest10 <br>
 * 类描述： 去重 <br>
 * <p>
 * 测试distinct去重方法
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 21:25<br>
 */
public class StreamTest10 {

    public static void main(String[] args) {
        String lines = "good good study day day up";
        List<String> list14 = new ArrayList<String>();
        list14.add(lines);
        List<String> words = list14.stream().flatMap(line -> Stream.of(line.split(" "))).filter(word -> word.length()
                > 0)
                .map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
        System.out.println("去重复之后:" + words);
    }

}
