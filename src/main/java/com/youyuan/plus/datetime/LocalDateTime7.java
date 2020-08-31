package com.youyuan.plus.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * 类名称：LocalDateTime7 <br>
 * 类描述： 时间相差比较 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/8/31 16:00<br>
 */
public class LocalDateTime7 {

    public static void main(String[] args) {
        LocalDate ld=LocalDate.parse("2017-11-17");
        LocalDate ld2=LocalDate.parse("2018-01-05");
        Period p=Period.between(ld, ld2);
        System.out.println("相差年: "+p.getYears()+" 相差月 :"+p.getMonths() +" 相差天:"+p.getDays());
    }

}
