package com.tedu.demos;

import java.util.Scanner;

/**
 *   比较运算符
 */
public class JavaDemo2 {

    public static void main(String[] args) {
        // 声明一个输入对象
        Scanner input = new Scanner(System.in);
        // 声明两个变量存储数值
        int number1,number2;
        // 提示用户并接收用户输入的数值
        System.out.print("请输入第一个数值:");
        number1 = input.nextInt();
        System.out.print("请输入第二个数值:");
        number2 = input.nextInt();
        // 输出两个数的比较结果
        System.out.println(number1 + " > " + number2 + " 结果是: " + (number1 > number2));
    }
}
