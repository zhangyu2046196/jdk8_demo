package com.youyuan.plus.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 类名称：StreamTest3 <br>
 * 类描述： 测试flatmap方法 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 14:19<br>
 */
public class StreamTest3 {

    public static void main(String[] args) {
        String worlds = "The way of the future";
        String w = "hello beijing";
        ArrayList<String> strings = new ArrayList<>();
        strings.add(worlds);
        strings.add(w);
        List<String> list = strings.stream().flatMap((str) -> Stream.of(str.split(" "))).filter((s) -> s.length()
                > 0).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }

}
