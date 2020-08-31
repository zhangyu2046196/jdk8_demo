package com.youyuan.plus.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 类名称：StreamTest7 <br>
 * 类描述： 测试peek使用 <br>
 * <p>
 * peek是对每个元素操作返回一个新的Stream
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 21:07<br>
 */
public class StreamTest7 {

    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four").filter((m) -> m.length() > 3).peek((p) -> System.out.println("转换之前:"
                + p)).map(String::toUpperCase).peek((p1) -> System.out.println("转换后:" + p1)).collect(Collectors.toList());
    }

}
