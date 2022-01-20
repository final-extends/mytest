package com.tedu.demos;
/**
 *
 *   自增、自减 后缀使用
 */
public class JavaDemo7 {

    public static void main(String[] args) {
        // 声明2个变量
        int number1 = 10,number2;
        number2 = number1++;
        /**
         以上等式的分析:
         第一步： number2 = number1;
         第二步： number1 = number1 + 1;

         */
        // 显示2个变量的最终结果
        System.out.println("number1="+number1+"\tnumber2="+number2);
    }
}
