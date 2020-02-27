package com.youyuan.test;

import com.youyuan.lambda.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试Stream的中间操作的筛选与切片
 * <p>
 * filter   根据条件过滤
 * limit    截取流中的元素
 * skip     跳过流中的指定元素个数
 * distinct 把流中的元素去重
 * @date 2020/2/25 9:26
 */
public class StreamTest2 {

    private static List<Employee> employees = Arrays.asList(
            new Employee("AA", 20, 9999.99),
            new Employee("BB", 38, 7777.77),
            new Employee("CC", 16, 6666.66),
            new Employee("DD", 52, 5555.55),
            new Employee("EE", 3, 3333.33),
            new Employee("FF", 39, 8889.87),
            new Employee("FF", 39, 8889.87)
    );

    public static void main(String[] args) {
        //测试Stream筛选与分片的中间操作，filter、limit、skip、distinct

        employees.stream()//创建流
                .filter((e) -> e.getSal() > 5000)//filter中间操作
                .skip(2)//skip中间操作
                .distinct()//distinct中间操作，需要对操作的元素重写equas方法和hashCode方法
                .limit(3)//limit中间操作
                .forEach(System.out::println);//终止操作

    }

}
