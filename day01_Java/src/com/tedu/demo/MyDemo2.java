package com.tedu.demo;

import java.util.Scanner;

public class MyDemo2 {

    public static void main(String[] args) {
        //1: 先声明一个接收用户输入的对象
        Scanner shuru = new Scanner(System.in);

        //2: 声明要使用的变量(注意变量的类型)
        String name;  // 姓名
        int age;  // 年龄
        char sex;  // 性别
        double score; // 考试得分

        //3: 提示用户输入相应的内容
        System.out.print("请输入您的姓名:");
        name = shuru.next();
        System.out.print("请输入您的年龄:");
        age = shuru.nextInt();
        System.out.print("请输入您的性别<男、女>:");
        sex = shuru.next().charAt(0);
        System.out.print("请输入您的得分:");
        score = shuru.nextDouble();

        //4: 显示个人信息
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别:"+sex);
        System.out.println("得分:"+score);

    }
}
