package com.tedu.demos;

import java.util.Scanner;

/**
 *   使用加单的 if 条件结构来完成以下问题
 *   问题:
 *       张浩Java成绩大于98分，而且音乐成绩大于80分，老师奖励他；或者Java成绩等于100分，音乐成绩大于70分，老师也可以奖励他
 */
public class JavaDemo12 {

    public static void main(String[] args) {
        // 1: 声明一个输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明要使用的变量用于存储Java成绩和音乐成绩
        double javaScore,musicScore;
        // 3: 提示用户输入Java成绩和音乐成绩
        System.out.print("请输入张浩同学的Java成绩:");
        javaScore = in.nextDouble();
        System.out.print("请输入张浩同学音乐成绩:");
        musicScore = in.nextDouble();
        // 4: 利用简单的 if 结构来对组合条件进行判断
        if((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)){
            System.out.println("奖励一个MP4！");
        }
    }
}
