package com.tedu.demos;

/**
 *    类型转换：自动类型转换
 */
public class JavaDemo9 {

    public static void main(String[] args) {
        // 声明两个类型变量
        int number1;
        double number2 = 15.96;
        // 将浮点类型的值赋给整数类型
        // 强制类型转换
        number1 = (int)number2;
        //number1 = Integer.valueOf(number2); // Double -> double ,Character -> char, Boolean -> boolean
        System.out.println("number1="+number1+"\tnumber2="+number2);
    }
}
