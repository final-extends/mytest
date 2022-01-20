package com.tedu.demo4;

import java.util.Scanner;

// 测试学员管理类
public class TestStudentManager {

    public static void main(String[] args) {
        // 1: 创建输入对象
        Scanner in = new Scanner(System.in);
        char chr;

        // 2: 实例化一个学员管理类对象
        StudentManager manager = new StudentManager();

        // 3: 提示用户输入学员姓名并调用添加学员姓名的方法
        do {

            System.out.print("请输入一个学员的姓名:");
            String name = in.next();
            manager.addName(name);  // 将学员姓名添加到学员姓名的数组中
            System.out.print("\n需要继续录入学员姓名吗?<y/n>:");
            chr = in.next().charAt(0);

        }while(chr == 'y' || chr == 'Y');

        // 4: 调用学员管理类中显示学员姓名的方法
        manager.showNames();

        // 5: 接收用户要查找的学生姓名
        System.out.print("请输入要查找的学生姓名:");
        String name = in.next();
        if( manager.findName(name) )
            System.out.println("查找到该学员!");
        else
            System.err.println("查无此人!");
    }
}
