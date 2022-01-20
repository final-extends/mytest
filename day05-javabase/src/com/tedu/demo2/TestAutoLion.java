package com.tedu.demo2;

import com.tedu.demo2.AutoLion;

// 测试电动玩具狮子的类
public class TestAutoLion {

    public static void main(String[] args) {

        // 实例化一个电动玩具狮子的对象
        AutoLion lion = new AutoLion();

        // 给玩具狮子的属性赋值
        // lion.color = "黑色";

        // 调用展示狮子信息的方法
        lion.showInfo();

        // 调用狮子奔跑的方法
        lion.run();

        // 调用狮子吼叫的方法
        lion.bark();

    }
}
