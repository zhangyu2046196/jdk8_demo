package com.youyuan.method;

/**
 * @author zhangy
 * @version 1.0
 * @description  接口中的默认方法
 * @date 2020/2/26 10:47
 */
public interface DefaultMethod {

    default public String getName(){
        return "哈哈哈";
    }

    public static void test(){
        System.out.println("接口的静态方法");
    }
}
