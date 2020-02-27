package com.youyuan.test;

import java.util.Comparator;

/**
 * @author zhangy
 * @version 1.0
 * @description 方法引用
 * <p>
 * 静态方法引用
 * @date 2020/2/24 19:21
 */
public class StaticMethodLambdaTest {

    public static void main(String[] args) {
        //未使用方法引用
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        int compare = comparator.compare(90, 30);
        System.out.println("compare:" + compare);

        //使用方法引用
        Comparator<Integer> integerComparator = Integer::compare;
        int compare1 = integerComparator.compare(92, 36);
        System.out.println("compare1:" + compare1);
    }

}
