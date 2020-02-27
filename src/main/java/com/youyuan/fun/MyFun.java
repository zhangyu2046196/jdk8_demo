package com.youyuan.fun;

/**
 * @author zhangy
 * @version 1.0
 * @description  自定义函数式接口,可以使用泛型
 * @date 2020/2/23 20:39
 */
@FunctionalInterface
public interface MyFun<T> {

    public Integer compare(T t);

}

