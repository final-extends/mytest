package com.tedu.demos;

import java.util.Scanner;

/**
 *   使用多重 if 结构
 *   问题:
 *     对学员的结业考试成绩评测
 *      成绩>=80 ：良好
 *      成绩>=60 ：中等
 *      成绩<60   ：差
 */
public class JavaDemo14 {

    public static void main(String[] args) {
        // 1: 声明一个输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明存储结业考试成绩的变量
        double score;
        // 3: 提示用户输入结业考试成绩并保存到变量中
        System.out.print("请输入结业考试的成绩:");
        score = in.nextDouble();
        // 4: 对分数进行区间判断
        if( score >= 80 && score <= 100){
            System.out.println("良好");
        }else if( score >= 60 && score < 80){
            System.out.println("中等");
        }else{
            System.out.println("差");
        }
    }
}
