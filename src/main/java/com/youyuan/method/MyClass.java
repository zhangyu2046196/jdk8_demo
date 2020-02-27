package com.youyuan.method;

/**
 * @author zhangy
 * @version 1.0
 * @description 接口中默认方法
 * @date 2020/2/26 10:48
 */
public class MyClass implements DefaultMethod {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getName());

        DefaultMethod.test();
    }

}
