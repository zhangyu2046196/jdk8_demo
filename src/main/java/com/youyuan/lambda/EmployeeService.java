package com.youyuan.lambda;

import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description  员工条件判断接口
 * @date 2020/2/23 18:50
 */
public interface EmployeeService {

    /**
     * 根据条件判断获取符合条件的员工集合
     * @param employee  员工
     * @return  true符合条件  false否
     */
    public boolean compare(Employee employee);
}
