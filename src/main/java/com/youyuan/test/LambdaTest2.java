package com.youyuan.test;

import com.youyuan.test.api.MyFunction1;

/**
 * @author zhangy
 * @version 1.0
 * @description 自定义函数式接口，把传递过来的参数转成大写
 * @date 2020/2/24 11:09
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        String str = "abcdEGk";
        String res = op(str, (s) -> s.toUpperCase());
        System.out.println("str:" + str + "    res:" + res);
    }


    /**
     * 执行方法把传递参数转成大写
     *
     * @param str         传递参数
     * @param myFunction1 执行转换接口
     * @return 返回转换完成的字符串
     */
    private static String op(String str, MyFunction1 myFunction1) {
        return myFunction1.getValue(str);
    }
}
