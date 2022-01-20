package com.tedu.demo;

import java.util.Scanner;

/**
 *   next() 和 nextLine() 接收上的区别
 *
 */
public class MyDemo3 {

    public static void main(String[] args) {
        // 1: 声明一个输入对象
        Scanner in = new Scanner(System.in);

        // 2: 声明一个存储一段文字内容的变量
        String message;

        // 3: 提示用户输入一串文字内容
        System.out.println("请输入一串内容:");
        //message = in.next();  // 对于 next() 接收字符串的时候遇到 空格 或 回车 都会被视为接收结束
        message = in.nextLine(); // 对于 nextLine() 接收字符串的时候遇到 回车 才会结束

        // 4: 将输入的内容进行输出显示
        System.out.println("您输入的内容是:"+message);
    }
}
