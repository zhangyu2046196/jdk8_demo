package com.youyuan.lambda;

import java.io.Serializable;

/**
 * @author zhangy
 * @version 1.0
 * @description  员工类
 * @date 2020/2/23 18:49
 */
public class EmployeePlus implements Serializable{
    private static final long serialVersionUID = 230529665762034968L;

    private String name;
    private Integer age;
    private double sal;
    private State state;

    public EmployeePlus() {
    }

    public EmployeePlus(String name, Integer age, double sal, State state) {
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "EmployeePlus{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeePlus that = (EmployeePlus) o;

        if (Double.compare(that.sal, sal) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        return state == that.state;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        temp = Double.doubleToLongBits(sal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    public enum State{
        FREE,    //空闲
        BUNY,    //繁忙
        VACTION  //休假
    }
}
