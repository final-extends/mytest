package com.tedu.demos;

import java.util.Scanner;

/**
 *
 *  基本 if...else 结构
 *  问题:
 *    如果张浩Java考试成绩大于98分，老师就奖励他一个MP4，否则老师就罚他进行编码
 */
public class JavaDemo13 {

    public static void main(String[] args) {
        // 1：声明输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明要使用的变量
        double javaScore;
        // 3: 提示用户输入并接收用户输入的Java成绩
        System.out.print("请输入张浩的Java成绩:");
        javaScore = in.nextDouble();

        // 方式1：采用if...else结构来解题
        // 4: 对张浩的Java成绩进行判断,满足要求奖励，反之受罚
        /*
        if( javaScore > 98 ){
            System.out.println("老师奖励他一个MP4！");
        }else{
            System.out.println("老师罚他进行编码!");
        }
        */

        // 方式2：采用2个if结构来解题
        if( javaScore > 98 ){
            System.out.println("老师奖励他一个MP4！");
        }

        if( javaScore <= 98 ){
            System.out.println("老师罚他进行编码!");
        }
    }
}
