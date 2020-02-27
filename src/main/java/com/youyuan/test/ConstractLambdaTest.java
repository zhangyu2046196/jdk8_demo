package com.youyuan.test;

import com.youyuan.lambda.Employee;

import java.util.function.Supplier;

/**
 * @author zhangy
 * @version 1.0
 * @description 构造器引用测试
 * <p>
 * 语法：
 * ClassName::new
 * <p>
 * 注意事项：要求要创建对象的构造器参数个数参数类型和函数式接口抽象方法的参数个数参数类型一致
 * @date 2020/2/24 19:29
 */
public class ConstractLambdaTest {

    public static void main(String[] args) {
        //使用Supplier<T>来测试返回一个Employee对象
        //未使用构造器引用
        Supplier<Employee> supplier = () -> new Employee();
        Employee employee = supplier.get();
        System.out.println(employee);

        //使用构造器引用
        Supplier<Employee> employeeSupplier = Employee::new;
        Employee emp = employeeSupplier.get();
        System.out.println(emp);
    }

}
