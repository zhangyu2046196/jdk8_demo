package com.youyuan.plus.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：LambdaTest1 <br>
 * 类描述： 测试lambda表达式遍历list <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/26 10:46<br>
 */
public class LambdaTest1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("dddd");
        System.out.println("lambda遍历list");
        list.forEach((l) -> System.out.println(l));

        System.out.println("lambda通过冒号方法引用遍历");
        list.forEach(System.out::println);
    }

}
