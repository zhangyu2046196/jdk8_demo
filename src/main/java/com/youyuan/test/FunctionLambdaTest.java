package com.youyuan.test;

import java.util.function.Function;

/**
 * @author zhangy
 * @version 1.0
 * @description java内置函数式接口Function<T,R>  有入参有返回值
 * <p>
 * 场景：传入一个字符串，把字符串转成大写返回
 * @date 2020/2/24 12:34
 */
public class FunctionLambdaTest {

    public static void main(String[] args) {
        String str = "abcdkiDs89k";
        String res = compareString(str, (s) -> s.toUpperCase());
        System.out.println("str:" + str + " res:" + res);
    }

    private static String compareString(String str, Function<String, String> function) {
        return function.apply(str);
    }
}
