package com.tedu.demos;

/**
 *    复合赋值运算符
 */
public class JavaDemo4 {

    public static void main(String[] args) {
        // 声明2个变量并赋值
        double number1 = 10,number2 = 20;
        number1 += number2;  // 等同于 number1 = number1 + number2;
        System.out.println("两数字相加的和为:"+number1);

    }
}
