package com.youyuan.test;

import com.youyuan.lambda.EmployeePlus;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zhangy
 * @version 1.0
 * @description Stream终止操作, 收集，Stream经过中间操作后把结果转成任意结果返回
 * @date 2020/2/25 17:46
 */
public class StreamTest8 {

    private static List<EmployeePlus> employees = Arrays.asList(
            new EmployeePlus("AA", 20, 9999.99, EmployeePlus.State.FREE),
            new EmployeePlus("BB", 38, 7777.77, EmployeePlus.State.BUNY),
            new EmployeePlus("CC", 16, 6666.66, EmployeePlus.State.VACTION),
            new EmployeePlus("DD", 52, 5555.55, EmployeePlus.State.BUNY),
            new EmployeePlus("EE", 3, 3333.33, EmployeePlus.State.FREE),
            new EmployeePlus("FF", 39, 8889.87, EmployeePlus.State.VACTION)
    );

    public static void main(String[] args) {
        //1、终止操作:收集    场景:获取employees集合中的元素个数
        Long collect = employees.stream()//创建流
                .collect(Collectors.counting());
        System.out.println("count:" + collect);

        System.out.println("-----------------------------");
        //2、终止操作:收集    场景:获取employees集合中的元素工资最高的员工信息
        Optional<EmployeePlus> collect1 = employees.stream()//获取流
                .collect(Collectors.maxBy((x, y) -> Double.compare(x.getSal(), y.getSal())));
        System.out.println("max sal employee:" + collect1.get());

        System.out.println("-----------------------------");
        //3、终止操作:收集    场景:获取employee集合中元素工资最低的工资
        Optional<Double> collect2 = employees.stream()// 创建 流
                .map(EmployeePlus::getSal)//映射把集合中Employee对象转成工资
                .collect(Collectors.minBy((x, y) -> Double.compare(x, y)));
        System.out.println("min sal:" + collect2.get());

        System.out.println("-----------------------------");
        //4、终止操作:收集    场景:把集合中的name转成一个list
        List<String> collect3 = employees.stream()// 创建流
                .map(EmployeePlus::getName)//把集合中元素Employee转成姓名返回
                .collect(Collectors.toList());
        collect3.forEach(System.out::println);

        System.out.println("-----------------------------");
        //5、终止操作:收集    场景:把集合中的年龄转成一个set集合
        Set<Integer> collect4 = employees.stream()// 获取流
                .map(EmployeePlus::getAge)//映射把集合中元素Employee转成年龄
                .collect(Collectors.toCollection(HashSet::new));
        collect4.forEach(System.out::println);

        System.out.println("------------------------------");
        //6、终止操作:收集     场景:通过一个返回值获取集合中所有用户工资的平均值、最大值、最小值
        DoubleSummaryStatistics collect5 = employees.stream()  //创建流
                .collect(Collectors.summarizingDouble(EmployeePlus::getSal));
        System.out.println("记录数:" + collect5.getCount() + " 最大值:" + collect5.getMax() + " 最小值:" + collect5.getMin() + " 平均值:" + collect5.getAverage() + " 总和:" + collect5.getSum());

        System.out.println("-------------------------------");
        //7、终止操作:收集     场景:根据用户状态分组
        Map<EmployeePlus.State, List<EmployeePlus>> collect6 = employees.stream() //创建流
                .collect(Collectors.groupingBy(EmployeePlus::getState));
        System.out.println(collect6);
    }


}
