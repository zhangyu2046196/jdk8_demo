package com.youyuan.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * @author zhangy
 * @version 1.0
 * @description lambda表达式  基础语法测试
 * @date 2020/2/23 20:23
 */
public class LambdaTestT {

    public static void main(String[] args) {
        //1、基础语法：无参数无返回值
        Runnable rable = () -> System.out.println("Hello");
        //2、基础语法：一个参数无返回值
        Consumer<String> consumer = (msg) -> System.out.println("Hello");
        //3、基础语法：lambda表达式左侧只有一个参数时小括号可省略
        Consumer<String> consumer1 = msg -> System.out.println("Hello");
        //4、基础语法：lambda表达式操作符右侧有返回值且只有一行代码时return语句可以省略
        BinaryOperator<Long> binaryOperator = (x, y) -> x + y;
        //5、基础语法：lambda表达式操作符右侧有返回值有多行代码时需要用{}包上
        BinaryOperator<Long> longBinaryOperator = (x, y) -> {
            System.out.println("Hello");
            return x + y;
        };
    }

}
