package com.tedu.demo2;

/**
 *    问题:
 *      小明过生日，爸爸送他一个电动狮子玩具，编程测试这个狮子能否正常工作
 *
 */

// 定义电动玩具狮子的类
public class AutoLion {
    // 属性
    String color = "黄色";  //玩具狮子的颜色属性,属性的默认值为“黄色”

    // 获得电动玩具狮子的颜色方法
    public String getColor(){
        return color;
    }

    // 定义狮子奔跑的方法
    public void run(){
        System.out.println("玩具狮子正在以0.1米/秒的速度向前奔跑");
    }

    // 定义狮子吼叫的方法
    public void bark(){
        System.out.println("狮子正在吼叫...");
    }

    // 定义展示狮子信息的方法
    public void showInfo(){
        System.out.println("这是一只"+getColor()+"的电动玩具狮子!");
    }
}
