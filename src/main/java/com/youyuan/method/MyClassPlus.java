package com.youyuan.method;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2020/2/26 11:07
 */
public class MyClassPlus implements DefaultMethod,MyFun {

    @Override
    public String getName() {
        return MyFun.super.getName();
    }
}
