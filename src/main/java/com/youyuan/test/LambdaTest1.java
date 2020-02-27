package com.youyuan.test;

import com.youyuan.lambda.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description lambda表达式测试 使用Collections.sort方法对Employee集合排序，排序规则如果年龄相同按照姓名排序，否则按照年龄排序
 * @date 2020/2/24 10:28
 */
public class LambdaTest1 {
    private static List<Employee> employees = Arrays.asList(
            new Employee("AA", 20, 9999.99),
            new Employee("BB", 38, 7777.77),
            new Employee("CC", 16, 6666.66),
            new Employee("DD", 52, 5555.55),
            new Employee("EE", 3, 3333.33)
    );

    public static void main(String[] args) {
        Collections.sort(employees, (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        employees.forEach(System.out::println);

    }

}
