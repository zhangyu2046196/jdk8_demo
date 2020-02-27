package com.youyuan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author zhangy
 * @version 1.0
 * @description java内置函数式接口Supplier无入参有返回值
 * <p>
 * 测试场景:返回一个整数集合
 * @date 2020/2/24 12:16
 */
public class SupplierLambdaTest {

    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list = importInteger(10, () -> random.nextInt(100));
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    /**
     * 测试Supplier无入参有返回值的内置函数式接口
     *
     * @param num      返回的元素个数
     * @param supplier 接口
     * @return 返回集合
     */
    private static List<Integer> importInteger(int num, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(supplier.get());
        }
        return list;
    }
}
