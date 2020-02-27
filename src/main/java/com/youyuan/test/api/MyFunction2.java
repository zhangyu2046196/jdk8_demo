package com.youyuan.test.api;

/**
 * @author zhangy
 * @version 1.0
 * @description 自定义泛型的函数式接口，抽象方法两个参数，返回两参数计算后的结果
 * @date 2020/2/24 11:14
 */
@FunctionalInterface
public interface MyFunction2<T, R> {

    public R getValue(T t1, T t2);
}
