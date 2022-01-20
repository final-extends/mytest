package com.tedu.demos;

import java.util.Scanner;

/**
 *    多重 if 结构解决如下问题：
 *    问题：
 *    韩嫣参加计算机编程大赛
 *      如果获得第一名，将参加麻省理工大学组织的1个月夏令营
 *      如果获得第二名，将奖励惠普笔记本电脑一部
 *      如果获得第三名，将奖励移动硬盘一个
 *      否则，不给任何奖励
 */
public class JavaDemo17 {
    public static void main(String[] args) {
        // 1: 声明输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明一个变量用于保存名次
        int number;
        // 3: 提示用户输入名次并保存到变量中
        System.out.print("请输入韩嫣参加计算机编程大赛的名次:");
        number = in.nextInt();
        // 4: 采用switch...case结构来完成
        switch (number){
            case 1:
                System.out.println("参加麻省理工大学组织的1个月夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;
            case 3:
                System.out.println("励移动硬盘一个");
                break;
            default:
                System.err.println("没有任何奖励!");
        }
    }
}
