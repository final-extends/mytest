package com.tedu.homework;

import java.util.Scanner;

// 显示个人信息
public class HomeWork2 {

    public static void main(String[] args) {
        // 1：声明一个输入对象
        Scanner input = new Scanner(System.in);
        // 2：声明存储个人信息的变量
        String name,address;
        int age;
        char sex;
        // 3：接收用户输入的信息
        System.out.print("请输入您的姓名:");
        name = input.next();
        System.out.print("请输入您的年龄:");
        age = input.nextInt();
        System.out.print("请输入您的性别<男、女>:");
        sex = input.next().charAt(0);
        System.out.print("请输入您的家庭住址:");
        address = input.next();

        // 4：显示个人信息
        // 方式1：采用println()方式显示
        System.out.println("---------------------------------");
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别:"+sex);
        System.out.println("家庭住址:"+address);
        System.out.println("---------------------------------");
        // 方式2：采用print()方式显示
        System.out.print("姓名"+name+"\n年龄:"+age+"\n性别:"+sex+"\n家庭住址:"+address);
    }
}
