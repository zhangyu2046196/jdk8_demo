package com.youyuan.forkjoin;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class TestForkJoin {

	/**
	 * 使用fork/join框架计算
	 */
	@Test
	public void test1(){
		long start = System.currentTimeMillis();
		
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<Long> task = new ForkJoinCalculate(0L, 10000000000L);
		
		long sum = pool.invoke(task);
		System.out.println(sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("耗费的时间为: " + (end - start)); //1933
	}

	/**
	 * 传统方式计算
	 */
	@Test
	public void test2(){
		long start = System.currentTimeMillis();
		
		long sum = 0L;
		
		for (long i = 0L; i <= 10000000000L; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("耗费的时间为: " + (end - start)); //3105
	}

	/**
	 * jdk1.8改成并行流的方式计算
	 *
	 * parallel把串行流切换成并行流，并行流底层用的就是fork/join框架
	 *
	 */
	@Test
	public void test3(){
		long start = System.currentTimeMillis();
		
		Long sum = LongStream.rangeClosed(0L, 10000000000L)
							 .parallel()
							 .sum();
		
		System.out.println(sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("耗费的时间为: " + (end - start)); //1536
	}

}
