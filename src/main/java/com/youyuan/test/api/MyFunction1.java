package com.youyuan.test.api;

/**
 * @author zhangy
 * @version 1.0
 * @description 自定义函数式接口，用于把传递进来参数转成大写
 * @date 2020/2/24 11:08
 */
@FunctionalInterface
public interface MyFunction1 {

    public String getValue(String str);

}
