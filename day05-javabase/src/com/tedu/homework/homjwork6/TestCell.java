package com.tedu.homework.homjwork6;

// 测试电池类
public class TestCell {

    public static void main(String[] args) {
        // 1: 实例化一个电池类对象
        Cell  cell = new Cell();

        // 2: 给电池类对象的属性赋值
        cell.brand = "飞利浦";

        // 3: 调用电池类对象蓄电的方法
        cell.battery();
    }
}
