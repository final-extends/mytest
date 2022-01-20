package com.tedu.demo3;

// 测试榨汁机的类
public class TestJuicer {

    public static void main(String[] args) {
        // 1: 实例化一个榨汁机的对象
        Juicer jiuyang = new Juicer();

        // 2: 调用榨汁机的方法
        System.out.println( jiuyang.juice("香蕉") );
    }
}
