package com.tedu.demos;

/**
 *   算数运算符(+,-,*,/,%)
 */
public class JavaDemo1 {

    public static void main(String[] args) {
        // 声明两个变量并给变量赋予对应的值
        int number1 = 10,number2 = 3;
        // 对两个变量进行输出运算结果
        System.out.println(number1+" + "+number2+" = "+(number1+number2));
        System.out.println(number1+" - "+number2+" = "+(number1-number2));
        System.out.println(number1+" / "+number2+" = "+(number1/number2));
        System.out.println(number1+" * "+number2+" = "+(number1*number2));
        System.out.println(number1+" % "+number2+" = "+(number1%number2));
    }
}
