package com.youyuan.plus.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 类名称：StreamTest11 <br>
 * 类描述： 测试allMathch、anyMatch、noneMatch <br>
 * <p>
 * allMatch:全部匹配返回true
 * anyMatch:一个匹配返回true
 * noneMatch:一个都不匹配返回true
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/27 12:42<br>
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 10, 1, 8, 9, 3);
        System.out.println("list:" + list);
        boolean allMatch = list.stream().allMatch(l -> l > 3);
        System.out.println("全部大于3:" + allMatch);
        boolean anyMatch = list.stream().anyMatch((l) -> l > 3);
        System.out.println("一个大于3:" + anyMatch);
        boolean noneMatch = list.stream().noneMatch((l) -> l > 3);
        System.out.println("没有大于3:" + noneMatch);
    }

}
