package com.tedu.demo;

import java.util.Scanner;

/**
 *    日期: 2021-10-26
 *    作者: 张三
 *    描述: 作为项目演示使用
 */
public class MyDemo1 {

    public static void main(String[] args) {
        // 声明变量
        String name,address;  // 存储姓名和家庭住址的变量
        int age;  // 存储年龄的变量
        double score;  // 存储分数的变量
        boolean sex; // 存储性别的变量
        char isOK;  // 存储是否通过的变量

        // 给变量赋值
        name = "张三";
        age = 20;
        score = 98.5;
        sex = false;
        address = "湖北武汉市";
        isOK = '是';

        // 输出变量中的值
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("分数:"+score);
        System.out.println("性别:"+sex);
        System.out.println("家庭住址:"+address);
        System.out.println("是否通过:"+isOK);
    }
}
