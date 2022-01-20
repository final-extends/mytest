package com.tedu.demos;

import java.util.Scanner;

/**
 *    嵌套 if 结构
 *    问题：
 *       学校举行运动会，百米赛跑跑入10秒内的学生有资格进决赛，根据性别分别进入男子组和女子组
 */
public class JavaDemo15 {

    public static void main(String[] args) {
        // 1：声明输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明一个存储比赛成绩的变量和一个性别的变量
        double score;
        String sex;
        // 3: 提示用户输入比赛成绩并接收比赛的成绩
        System.out.print("请输入比赛的成绩(单位:秒):");
        score = in.nextDouble();
        // 4: 判断该比赛成绩是否能够进入决赛
        if( score < 10 ){
            // 5: 提示用户输入性别并接收
            System.out.print("请输入选手的性别<男/女>:");
            sex = in.next();
            // 6: 对选手的性别进行判断然后决定选手进入哪一个组参加决赛
            if( sex.equals("男") ){
                System.out.println("进入男子组参加决赛");
            }else if( sex.equalsIgnoreCase("女") ) {
                System.out.println("进入女子组参加决赛");
            }else{
                System.err.println("输入性别有误!");
            }
        }else{
            System.out.println("抱歉,您无缘决赛,请继续努力加油!");
        }
    }
}
