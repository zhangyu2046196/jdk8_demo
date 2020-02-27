package com.youyuan.test;

import java.util.function.Consumer;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试java内置函数式接口Consumer<T> 有入参无返回值
 *
 * 测试场景：传递参数为金额，购买商品
 *
 * @date 2020/2/24 12:11
 */
public class ConsumerLambdaTest {

    public static void main(String[] args) {
        test(9999d, (s) -> System.out.println("买了个苹果手机，消费:" + s));
    }

    private static void test(double d, Consumer<Double> consumer) {
        consumer.accept(d);
    }

}
