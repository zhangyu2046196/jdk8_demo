package com.youyuan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author zhangy
 * @version 1.0
 * @description java内置函数式接口Predicate<T> 有入参有返回值，返回值时一个判断后的boolean，这是一个断言的函数式接口
 * <p>
 * 场景：入参位一个集合，经过接口判断返回集合中长度大于3的值
 * @date 2020/2/24 12:42
 */
public class PredicateLambdaTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("youyuan", "beijing", "money", "www", "jack", "ok","shanghai","baoding");
        List<String> stringList = conditionStr(list, (s) -> s.length() > 3);
        stringList.forEach(System.out::println);
    }

    private static List<String> conditionStr(List<String> list, Predicate<String> predicate) {
        List<String> reList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                reList.add(s);
            }
        }
        return reList;
    }
}
