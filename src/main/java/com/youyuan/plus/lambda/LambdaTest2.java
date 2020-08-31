package com.youyuan.plus.lambda;

/**
 * 类名称：LambdaTest2 <br>
 * 类描述： 测试lambda创建匿名内部类 <br>
 * <p>
 * 以创建线程类为例讲解
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 10:52<br>
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        //普通创建线程类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("普通方式创建线程类");
            }
        };

        //使用lambda表达式创建线程匿名类
        Runnable runnable1 = () -> System.out.println("lambda方式创建线程匿名类");

        new Thread(runnable).start();
        new Thread(runnable1).start();
    }

}
