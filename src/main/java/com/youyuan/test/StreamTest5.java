package com.youyuan.test;

import com.youyuan.lambda.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description Stream中间操作，排序
 * <p>
 * sorted                      自然排序
 * sorted(Comparator com)      根据比较器排序
 * @date 2020/2/25 11:34
 */
public class StreamTest5 {

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
        //stream中间操作，自然排序
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff");
        list.stream()//获取流
                .distinct()//去重
                .sorted()//自然排序
                .forEach(System.out::println);//终止操作

        System.out.println("--------------------------------");

        //st ream中间操作，按照比较器comparator排序,先判断年龄如果年龄相同按照工资排序，否则按照年龄排序
        employees.stream()//创建流
                .distinct()//去重
                .sorted((o1, o2) -> {
                    if (o1.getAge() == o2.getAge()) {
                        return Double.compare(o1.getSal(), o2.getSal());
                    } else {
                        return Integer.compare(o1.getAge(), o2.getAge());
                    }
                })//按照比较器排序
                .forEach(System.out::println);//终止操作
    }

}
