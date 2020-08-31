package com.youyuan.plus.stream;

import java.util.stream.Stream;

/**
 * 类名称：StreamTest13 <br>
 * 类描述： 测试interate方法 <br>
 *
 * iterate 跟 reduce 操作很像，接受一个种子值，和一个UnaryOperator（例如 f）。 然后种子值成为 Stream 的第一个元素，f(seed) 为第二个，f(f(seed)) 第三个，以此类推。 在 iterate 时候管道必须有 limit 这样的操作来限制 Stream 大小
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/27 13:02<br>
 */
public class StreamTest13 {

    public static void main(String[] args) {
        System.out.println("从2开始生成一个等差队列:");
        Stream.iterate(2, n -> n + 2).limit(5).forEach(x -> System.out.print(x + " "));
    }

}
