package com.youyuan.dtime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author zhangy
 * @version 1.0
 * @description 用ThreadLocal保证SimpleDataFormat线程安全
 * <p>
 * 场景:启动10个线程，格式化指定的时间字符串
 * @date 2020/2/26 11:55
 */
public class SimpleDataFormatTest1 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return ThreadLocalDataTime.sdf.get().parse("2020-02-22");
            }
        };

        List<Date> list = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(10);//创建10个线程
        for (int i = 1; i <= 10; i++) {
            Future<Date> str = executorService.submit(task);//启动线程执行
            list.add(str.get());
        }

        list.forEach(System.out::println);

        executorService.shutdown();//关闭线程池

    }

}
