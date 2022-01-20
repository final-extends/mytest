package com.tedu.demos;

import java.util.Scanner;

// 逻辑运算符
public class JavaDemo3 {

    public static void main(String[] args) {
        // 声明一个输入对象
        Scanner in = new Scanner(System.in);
        // 声明一个存放数值的变量
        int number;
        // 提示用户输入一个数值并保存到变量中
        System.out.print("请输入一个数字:");
        number = in.nextInt();
        // 对该数值进行判断
        System.out.println("输入的数值在0-10之间吗? "+(number >= 0 && number <= 10));

    }
}
