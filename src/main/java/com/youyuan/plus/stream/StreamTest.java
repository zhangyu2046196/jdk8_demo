package com.youyuan.plus.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类名称：StreamTest <br>
 * 类描述： 测试stream 过滤操作 <br>
 * <p>
 * 定义一个集合 通过普通方式和Stream filter方式过滤
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 11:09<br>
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三", "李四", "王五", "xuwujing");

        System.out.println("过滤之前:" + list);

        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (!"李四".equals(str)) {
                result.add(str);
            }
        }
        System.out.println("普通方式过滤之后:" + result);

        List<String> stringList = list.stream().filter((str) -> !"李四".equals(str)).collect(Collectors.toList());
        System.out.println("Stream filter方式过滤后:" + stringList);
    }

}
