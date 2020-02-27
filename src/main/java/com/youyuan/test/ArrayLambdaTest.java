package com.youyuan.test;

import java.util.function.Function;

/**
 * @author zhangy
 * @version 1.0
 * @description 数组引用
 * <p>
 * lambda表达式操作符右边是创建数组
 * @date 2020/2/24 19:35
 */
public class ArrayLambdaTest {

    public static void main(String[] args) {
        //未使用数组引用
        Function<Integer, Integer[]> function = (len) -> new Integer[len];
        Integer[] apply = function.apply(10);
        System.out.println("length:" + apply.length);

        //使用数组引用
        Function<Integer, Integer[]> integerFunction = Integer[]::new;
        Integer[] integers = integerFunction.apply(16);
        System.out.println("length:" + integers.length);
    }

}
