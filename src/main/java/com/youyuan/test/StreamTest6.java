package com.youyuan.test;

import com.youyuan.lambda.EmployeePlus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangy
 * @version 1.0
 * @description Stream终止操作
 * <p>
 * allMatch     判断集合元素是否全部匹配，全部匹配返回true,否则返回false,传递一个Predicate函数，返回一个boolean类型,
 * anyMath      判断集合元素是否有一个匹配，只要有一个匹配返回true,否则返回false,传递一个Predicate函数，返回一个boolean类型,
 * noneMath     判断集合元素是否全部不匹配，全部不匹配返回true,否则返回false,传递一个Predicate函数，返回一个boolean类型,
 * findFist     返回第一个元素
 * findAny      返回任意一个元素
 * count        返回集合元素个数
 * max          返回最大值，传递一个Comparator比较器，返回根据比较规则计算出来的最大值
 * min          返回最小值，传递一个Comparator比较器，返回根据比较规则计算出来的最小值
 * @date 2020/2/25 13:03
 */
public class StreamTest6 {

    private static List<EmployeePlus> employees = Arrays.asList(
            new EmployeePlus("AA", 20, 9999.99, EmployeePlus.State.FREE),
            new EmployeePlus("BB", 38, 7777.77, EmployeePlus.State.BUNY),
            new EmployeePlus("CC", 16, 6666.66, EmployeePlus.State.VACTION),
            new EmployeePlus("DD", 52, 5555.55, EmployeePlus.State.BUNY),
            new EmployeePlus("EE", 3, 3333.33, EmployeePlus.State.FREE),
            new EmployeePlus("FF", 39, 8889.87, EmployeePlus.State.VACTION)
    );

    public static void main(String[] args) {
        //1、终止操作:allMatch  场景：查找集合中的每个员工状态是否都是BUNY
        boolean b = employees.stream()//获取流
                .allMatch((e) -> e.getState() == EmployeePlus.State.BUNY);
        System.out.println("allMatch:" + b);

        System.out.println("----------------------------------");
        //2、终止操作:anyMatch  场景:查找集合中的员工是否有一个状态是BUNY
        boolean b1 = employees.stream()//获取流
                .anyMatch((e) -> e.getState() == EmployeePlus.State.BUNY);
        System.out.println("anyMatch:" + b1);

        System.out.println("----------------------------------");
        //3、终止操作:noneMatch   场景:查找集合中员工是否没有一个状态是BUNY
        boolean b2 = employees.stream()//获取流
                .noneMatch((e) -> e.getState() == EmployeePlus.State.BUNY);
        System.out.println("noneMatch:" + b2);

        System.out.println("----------------------------------");
        //4、终止操作:findFirst   场景:取出集合中第一个元素
        Optional<EmployeePlus> first = employees.stream()//获取流
                .findFirst();
        System.out.println("findFirst:" + first.get());

        //5、终止操作:findAny     场景:根据集合中员工工资排序，取出任意一个员工的工资
        Optional<Double> any = employees.stream()//获取流
                .map(EmployeePlus::getSal)//map映射，返回员工工资
                .findAny();
        System.out.println("findAny:" + any.get());

        System.out.println("----------------------------------");
        //6、终止操作:count       场景:查找集合中员工工资大于5000的员工个数
        long count = employees.stream()// 创建流
                .filter((e) -> e.getSal() > 5000)//过滤工资大于5000的员工
                .count();
        System.out.println("count:" + count);

        System.out.println("----------------------------------");
        //7、终止操作:max         场景:查找集合中员工工资最大的员工
        Optional<EmployeePlus> max = employees.stream()//创 建流
                .max((o1, o2) -> Double.compare(o1.getSal(), o2.getSal()));
        System.out.println("max:" + max.get());

        System.out.println("----------------------------------");
        //8、终止操作:min         场景:查找集合中员工工资大于5000的所有员工中工资最低的员工工资
        Optional<Double> aDouble = employees.stream() //创 建 流
                .filter((e) -> e.getSal() > 5000) //过滤集合中员工工资大于5000的员工
                .map(EmployeePlus::getSal) //通过映射返回员工工资
                .min((s1, s2) -> Double.compare(s1, s2));
        System.out.println("min:" + aDouble.get());


    }
}
