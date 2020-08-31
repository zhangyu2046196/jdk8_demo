package com.youyuan.plus.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名称：LambdaTest <br>
 * 类描述： 测试lambda表达式遍历map <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/25 14:19<br>
 */
public class LambdaTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");

        System.out.println("map普通方式遍历:");
        for (String key : map.keySet()) {
            System.out.println("k=" + key + "，v=" + map.get(key));
        }

        System.out.println("lambda表达式遍历");
        map.forEach((k, v) -> {
            System.out.println("k=" + k + ",v=" + v);
        });
    }
}
