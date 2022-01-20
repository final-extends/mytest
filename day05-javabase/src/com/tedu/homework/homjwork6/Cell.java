package com.tedu.homework.homjwork6;

/**
 *
 *    作业6：
 *     编写电池类（Cell）：
 *         具有品牌属性，可以续电
 * 	       编写测试类（TestCell）
 */
// 定义电池类
public class Cell {
    // 属性部分
    String brand;

    // 定义可以蓄电的方法
    public void battery(){
        System.out.println(brand+"的电池正在蓄电中...");
    }
}
