package com.youyuan.test;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * @author zhangy
 * @version 1.0
 * @description 方法引用测试
 * <p>
 * 对象名::方法名
 * @date 2020/2/24 18:29
 */
public class MethodLambdaTest {

    public static void main(String[] args) {
        //比如用Consumer<T>函数式接口来测试打印信息
        //未使用方法引用
        Consumer<String> consumer = (s) -> System.out.println(s);
        //调用函数式接口的方法
        consumer.accept("北京友缘在线");
        System.out.println("----------------------");
        //使用方法引用 System.out会创建一个方法使用如下
        Consumer<String> stringConsumer = System.out::println;
        //调用函数式接口的方法
        stringConsumer.accept("华夏希望教育集团");

        System.out.println("---------------------");
        //使用System.out换一种方式
        PrintStream out = System.out;
        //使用方法引用
        Consumer<String> cTT = out::println;
        cTT.accept("结信网络公司");

    }

}
