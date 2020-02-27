package com.youyuan.test;

import com.youyuan.lambda.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author zhangy
 * @version 1.0
 * @description 创建Stream的方式
 * @date 2020/2/24 20:30
 */
public class StreamTest1 {

    public static void main(String[] args) {
        //1、通过集合的stream()方法创建串行流，通过paralleStream()方法创建并行流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();//创建串行流
        Stream<String> stringStream = list.parallelStream();//创建并行流

        //2、通过数组的Arrays中的静态方法stream()给数组创建流
        IntStream stream1 = Arrays.stream(new int[10]);//创建一个长度为10的整型数组的流
        DoubleStream stream2 = Arrays.stream(new double[10]);//创建一个长度为10的double类型的数组流
        Stream<Employee> stream3 = Arrays.stream(new Employee[10]);//创建一个长度为10的自定义的员工数组的流

        //3、通过Stream的静态方法of创建流
        Stream<String> stringStream1 = Stream.of(new String[10]);//创建一个传递过来的长度10的String的数组对应的流

        //4、创建无限流
            //1)通过迭代器的方式创建
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(20).forEach(System.out::println);
        System.out.println("-----------------------");
            //2)生成
        Stream<Integer> generate = Stream.generate(() -> new Random().nextInt(100));
        generate.limit(8).forEach(System.out::println);
    }

}
