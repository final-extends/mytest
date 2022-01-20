package com.tedu.demo5;

import java.util.Scanner;

// 计算器的测试类
public class TestCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1: 实例化一个计算器对象
        Calculator calculator = new Calculator();

        // 2: 提示用户输入两个操作数并作为运算的依据
        System.out.print("请输入第一个操作数:");
        double num1 = in.nextDouble();
        System.out.print("请输入第二个操作数:");
        double num2 = in.nextDouble();

        // 3: 提示用户输入操作符
        System.out.print("请输入运算符<+,-,*,/>:");
        char oper = in.next().charAt(0);

        // 4: 调用计算器类中的计算方法，通过传入的运算符参数来给出运算结果
        System.out.println( calculator.compute(num1,num2,oper) );

    }
}
