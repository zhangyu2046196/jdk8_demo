package com.youyuan.plus.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 类名称：StreamTest9 <br>
 * 类描述： 取最大最小值 <br>
 * <p>
 * max、min
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 21:23<br>
 */
public class StreamTest9 {

    public static void main(String[] args) {
        List<String> list13 = Arrays.asList("zhangsan", "lisi", "wangwu", "xuwujing");
        int maxLines = list13.stream().mapToInt(String::length).max().getAsInt();
        int minLines = list13.stream().mapToInt(String::length).min().getAsInt();
        System.out.println("最长字符的长度:" + maxLines + ",最短字符的长度:" + minLines);
    }

}
