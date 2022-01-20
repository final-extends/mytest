package com.tedu.demo5;

/**
 *   计算器类
 */
public class Calculator {
    // 属性定义
//    double number1,number2;

    // 定义计算的方法
    public String compute(double number1,double number2,char operator){
        switch (operator){
            case '+':
               return number1+" + "+number2 + " = "+(number1+number2);
            case '-':
                return number1+" - "+number2 + " = "+(number1-number2);
            case '*':
                return number1+" * "+number2 + " = "+(number1*number2);
            case '/':
                return number1+" / "+number2 + " = "+(number1/number2);
            default:
                return "您输入的运算符不正确,无法完成计算!";
        }
    }
}
