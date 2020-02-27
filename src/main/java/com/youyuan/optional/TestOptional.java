package com.youyuan.optional;

import com.youyuan.lambda.Employee;
import com.youyuan.lambda.EmployeePlus;
import org.junit.Test;

import java.util.Optional;

/**
 * @author zhangy
 * @version 1.0
 * @description Optional是一个容器，尽量避免空指针异常
 * <p>
 * 常用方法：
 * <p>
 * 1.Optional.of(T t) : 创建一个 Optional 实例
 * 2.Optional.empty() : 创建一个空的 Optional 实例
 * 3.Optional.ofNullable(T t):若 t 不为 null,创建 Optional 实例,否则创建空实例
 * 4.isPresent() : 判断是否包含值
 * 5.orElse(T t) : 如果调用对象包含值，返回该值，否则返回t
 * 6.orElseGet(Supplier s) :如果调用对象包含值，返回该值，否则返回 s 获取的值
 * 7.map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
 * 8.flatMap(Function mapper):与 map 类似，要求返回值必须是Optional
 * @date 2020/2/26 9:20
 */
public class TestOptional {

    /**
     * Optional.of(T t) : 创建一个 Optional 实例
     */
    @Test
    public void test1() {
        Optional<Object> o = Optional.of(null);
        System.out.println(o.get());
    }

    /**
     * Optional.empty() : 创建一个空的 Optional 实例
     */
    @Test
    public void test2() {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.get());
    }

    /**
     * Optional.ofNullable(T t):若 t 不为 null,创建 Optional 实例,否则创建空实例
     */
    @Test
    public void test3() {
        Optional<EmployeePlus> op = Optional.ofNullable(new EmployeePlus("北京", 26, 8989.98, EmployeePlus.State.BUNY));
        System.out.println(op.get());

        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o.get());
    }

    /**
     * isPresent() : 判断是否包含值
     */
    @Test
    public void test4() {
//        Optional<EmployeePlus> op = Optional.ofNullable(null);
        Optional<EmployeePlus> op = Optional.ofNullable(new EmployeePlus("北京", 26, 8989.98, EmployeePlus.State.BUNY));
        System.out.println(op.isPresent());
    }

    /**
     * orElse(T t) : 如果调用对象包含值，返回该值，否则返回t
     */
    @Test
    public void test5() {
        Optional<Employee> op = Optional.ofNullable(new Employee());

        if(op.isPresent()){
            System.out.println(op.get());
        }

        Employee emp = op.orElse(new Employee("AA",20,19.2));
        System.out.println(emp);

        Employee emp2 = op.orElseGet(() -> new Employee());
        System.out.println(emp2);
    }

    /**
     * map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
     */
    @Test
    public void test6(){
        Optional<EmployeePlus> op = Optional.of(new EmployeePlus("上海", 23, 18.92, EmployeePlus.State.FREE));

        Optional<String> op2 = op.map(EmployeePlus::getName);
        System.out.println(op2.get());
    }

}
