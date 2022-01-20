package com.tedu.demos;

import java.util.Scanner;

/**
 *
 *  判断闰年平年
 *    能够被4整除，但不能被100整除。或者可以直接被400整除的年份称为闰年
 */
public class JavaDemo19 {

    public static void main(String[] args) {
        // 1: 声明输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明一个变量用于保存名次
        int year;
        // 3: 提示用户输入名次并保存到变量中
        System.out.print("请输入年份:");
        year = in.nextInt();
        // 4:使用 if...else表达式完成
        String message = ( (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0)?"闰年":"平年";
        System.out.println(year+"年是:"+message);
    }
}
