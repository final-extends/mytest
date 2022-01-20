package com.tedu.demo1;

/**
 *    测试玩具狮子的类
 */
public class TestAutoLion {

    public static void main(String[] args) {
         // 1: 实例化一个玩具狮子对象
        AutoLion lion = new AutoLion();

         // 2: 给狮子的属性赋值
        lion.color = "黑色";

         // 3: 调用玩具狮子的方法
        // String color = lion.getColor();  // 调用获取狮子颜色的方法
        System.out.println("狮子的颜色是:"+ lion.getColor());
        lion.bark();  // 调用狮子吼叫的方法
        lion.run();   // 调用狮子奔跑的方法
    }
}
