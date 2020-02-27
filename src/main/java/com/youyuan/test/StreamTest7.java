package com.youyuan.test;

import com.youyuan.lambda.EmployeePlus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangy
 * @version 1.0
 * @description Stream的终止操作，归约，可以对集合中所有元素反复操作返回结果，可以对集合中元素求和、拼接字符串等
 * @date 2020/2/25 17:35
 */
public class StreamTest7 {

    private static List<EmployeePlus> employees = Arrays.asList(
            new EmployeePlus("AA", 20, 9999.99, EmployeePlus.State.FREE),
            new EmployeePlus("BB", 38, 7777.77, EmployeePlus.State.BUNY),
            new EmployeePlus("CC", 16, 6666.66, EmployeePlus.State.VACTION),
            new EmployeePlus("DD", 52, 5555.55, EmployeePlus.State.BUNY),
            new EmployeePlus("EE", 3, 3333.33, EmployeePlus.State.FREE),
            new EmployeePlus("FF", 39, 8889.87, EmployeePlus.State.VACTION)
    );

    public static void main(String[] args) {
        //1、终止操作:归约   场景:对集合中的所有元素求和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream()// 获取流
                .reduce(0, (x, y) -> x + y);
        System.out.println("reduce sum:" + reduce);

        System.out.println("----------------------------");
        //2、终止操作:归约   场景:对employees集合中的所有员工的工资求和，然后返回总工资
        Optional<Double> reduce1 = employees.stream()//创建流
                .map(EmployeePlus::getSal)//把Employee对象转成工资
                .reduce((x, y) -> x + y);
        System.out.println("reduce employe sum:" + reduce1.get());

        System.out.println("-----------------------------");
        //3、终止操作:归约   场景:定义一个字符串集合，拼接字符串，返回拼接后的字符串
        List<String> stringList = Arrays.asList("北京", "友缘", "在线", "网络", "科技", "有限", "公司");
        Optional<String> reduce2 = stringList.stream()//获取流
                .reduce((x, y) -> x + y);
        System.out.println("reduce str append:" + reduce2.get());
    }

}
