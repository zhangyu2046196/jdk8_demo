package com.youyuan.fun;

/**
 * @author zhangy
 * @version 1.0
 * @description 自定义函数式接口来测试 lambda 表达式
 * @date 2020/2/23 20:42
 */
public class LambdaT {

    public static void main(String[] args) {
        Integer n = conditiond(100, (x) -> x * x);
        System.out.println("n:" + n);
    }

    /**
     * 计算方法
     *
     * @param num
     * @param myFun
     * @return
     */
    private static Integer conditiond(Integer num, MyFun<Integer> myFun) {
        return myFun.compare(num);
    }

}
