package com.youyuan.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description lambda表达式测试
 * <p>
 * lambda表达式是一个匿名函数，基于抽象层(接口或抽象类)来开发，要求抽象层只能有一个抽象方法，因为多个识别不出来
 * <p>
 * Employee为员工类，里面有属性age和sal，定义一个接口用于根据age或sal来判断取出符合条件的员工集合
 * EmployeeService  员工接口，有一个方法用于根据年龄或工资判断查询符合条件的员工集合
 * @date 2020/2/23 18:45
 */
public class LambdaTest {

    public static void main(String[] args) {
        //初始化员工列表
        List<Employee> employees = Arrays.asList(
                new Employee("AA", 20, 9999.99),
                new Employee("BB", 38, 7777.77),
                new Employee("CC", 16, 6666.66),
                new Employee("DD", 52, 5555.55),
                new Employee("EE", 3, 3333.33)
        );

        //使用lambda表达式查询年龄大于30的员工
        List<Employee> emps = getEmployeeByCondition(employees, (employee) -> employee.getAge() > 30);
        for (Employee emp : emps) {
            System.out.println(emp);
        }
        System.out.println("=======================");
        //使用lambda表达式查询工资小于8000年龄小于52的员工
        emps=getEmployeeByCondition(employees,(employee) -> employee.getSal()<8000 && employee.getAge()<52);
        emps.forEach(System.out::println);//使用stream api打印
    }

    /**
     * 根据条件查询符合条件的员工信息，此处使用策略设计模式
     *
     * @param employees 原始员工列表
     * @param service   条件接口
     * @return 返回符合条件的员工列表
     */
    private static List<Employee> getEmployeeByCondition(List<Employee> employees, EmployeeService service) {
        List<Employee> emps = new ArrayList<Employee>();
        for (Employee employee : employees) {
            if (service.compare(employee)) {
                emps.add(employee);
            }
        }
        return emps;
    }

}
