package com.youyuan.test;

import com.youyuan.lambda.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author zhangy
 * @version 1.0
 * @description Stream中间操作，映射
 * <p>
 * map      传递一个函数，集合中的每个元素都应用这个函数然后返回一个新的元素
 * flatmap  传递一个函数，集合中的每个元素都应用这个函数然后每个元素返回一个流
 * @date 2020/2/25 10:06
 */
public class StreamTest3 {

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
        //测试中间操作的map
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff");
        //测试集合list转成流然后把集合中的元素转成大写打印
        list.stream()//创建流
                .map((s) -> s.toUpperCase())//map操作集合中每个元素都应用这个函数然后每个元素操作后返回一个新元素
                .forEach(System.out::println);//终止操作
        System.out.println("----------------------------------");
        //测试中间操作map，把集合employees中的元素通过map操作返回姓名，通过distinct操作去重，通过limit操作返回前5条信息
        employees.stream()//创建流
                .distinct()//去重
                .map(Employee::getName)//方法引用
                .limit(5)//截取
                .forEach(System.out::println);//终止操作

        System.out.println("----------------------------------");
        list.stream()//创建流
                .flatMap(StreamTest3::transforBean)//方法引用
                .forEach(System.out::println);//终止操作
    }

    /**
     * 传递一个字符串，然后将字符串遍历字符，返回一个流
     *
     * @param str 字符串
     * @return 返回流
     */
    private static Stream<Character> transforBean(String str) {
        List<Character> list = new ArrayList<>();
        for (Character character : str.toCharArray()) {
            list.add(character);
        }
        return list.stream();
    }

}
