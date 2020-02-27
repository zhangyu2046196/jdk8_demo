package com.youyuan.test;

import com.youyuan.test.api.MyFunction2;

/**
 * @author zhangy
 * @version 1.0
 * @description 自定义函数式接口带泛型，抽象方法有两个参数，返回两个参数计算后结果
 * @date 2020/2/24 11:16
 */
public class LambdaTest3 {

    public static void main(String[] args) {
        Long compare = compare(100L, 200L, (t1, t2) -> t1 + t2);
        System.out.println("compare:" + compare);
    }

    private static Long compare(Long l1, Long l2, MyFunction2<Long, Long> myFunction2) {
        return myFunction2.getValue(l1, l2);
    }

}
