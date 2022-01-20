package com.tedu.demo1;

/**
 *    定义玩具狮子类
 */
public class AutoLion {
    // 属性
    String color;  // 狮子的颜色属性

    // 获得狮子颜色的方法
    public String getColor(){
        return color;
    }

    // 定义狮子吼叫的方法
    public void bark(){
        System.out.println("狮子正在大声的吼叫...");
    }

    // 定义狮子奔跑的方法
    public void run(){
        System.out.println("狮子正在以0.1米/秒的速度向前奔跑着.");
    }
}
