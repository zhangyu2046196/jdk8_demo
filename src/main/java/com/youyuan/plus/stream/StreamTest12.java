package com.youyuan.plus.stream;

import java.util.stream.Stream;

/**
 * 类名称：StreamTest12 <br>
 * 类描述： 测试reduce归约操作 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/27 12:54<br>
 */
public class StreamTest12 {

    public static void main(String[] args) {
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println("字符串拼接:" + concat);

        double minValue = Stream.of(-4.0, 1.0, 3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        System.out.println("最小值:" + minValue);

        // 求和, 无起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println("有无起始值求和:" + sumValue);
        // 求和, 有起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(1, Integer::sum);
        System.out.println("有起始值求和:" + sumValue);

        concat = Stream.of("a", "B", "c", "D", "e", "F").filter(x -> x.compareTo("Z") > 0).reduce("", String::concat);
        System.out.println("过滤和字符串连接:" + concat);
    }

}
