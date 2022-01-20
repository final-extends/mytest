package com.tedu.demos;

import java.util.Scanner;

/**
 *   简单 if 条件结构
 *   问题:
 *      如果张浩的Java考试成绩大于98分，张浩就能获得一个MP4作为奖励
 */
public class JavaDemo11 {

    public static void main(String[] args) {
        // 1: 声明一个输入对象
        Scanner in =new Scanner(System.in);
        // 2: 声明一个保存张浩Java考试成绩的变量
        double javaScore;
        // 3: 提示用户输入张浩的Java成绩
        System.out.print("请输入张浩的Java成绩:");
        javaScore = in.nextDouble();
        // 4: 利用简单的 if 条件结构来进行判断张浩是否能够获得奖励
        if( javaScore > 98 ){
            System.out.println("获得一个MP4作为奖励");
        }

    }
}
