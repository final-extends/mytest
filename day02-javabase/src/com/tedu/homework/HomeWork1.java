package com.tedu.homework;

import java.util.Scanner;

// 交换两个数值
public class HomeWork1 {

    public static void main(String[] args) {
        // 声明一个输入对象
        Scanner input = new Scanner(System.in);
        // 声明3个变量
        int number1,number2,center;
        // 给2个变量number1,number2赋值
        // 提示用户输入数值并保存到变量number1、number2中
        System.out.print("请输入第一个数字:");
        number1 = input.nextInt();
        System.out.print("请输入第二个数字:");
        number2 = input.nextInt();
        System.out.println("交换前number1="+number1+"\tnumber2="+number2);
        // 交换两个数值
        center = number1;
        number1 = number2;
        number2 = center;
        System.out.println("交换后number1="+number1+"\tnumber2="+number2);
    }
}
