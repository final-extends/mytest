package com.tedu.homework.homework5;

import java.util.Scanner;

/**
 *   5-4：更改管理员密码，更改要求如下：
 *        输入旧的用户名和密码，如果正确，方有权限更新  从键盘获取新的密码，进行更新
 */
public class TestAdministrator2 {

    public static void main(String[] args) {
        // 定义一个标记变量
        boolean flag = false;  // 默认没有匹配上任何一个管理员对象的用户名和密码

        // 1: 声明一个管理员类型的数组,主要用于存放多个管理员对象
        Administrator[] administrators = new Administrator[3];

        // 2: 给数组的每个管理员对象的属性进行赋值
        administrators[0] = new Administrator();  // 方式1：数组元素实例化一个管理员对象
        administrators[0].name = "郭俊杰";
        administrators[0].password = "123456";

        // 方式2：实例化一个管理员对象然后给其属性赋值然后再付给数组元素
        Administrator hu = new Administrator();
        hu.name = "胡睿";
        hu.password = "666888";
        administrators[1] = hu;

        administrators[2] = new Administrator();
        administrators[2].name = "张小龙";
        administrators[2].password = "888888";

        // 3: 要求用户输入要修改的管理员用户名和原始密码
        System.out.print("请输入用户名:");
        String name = new Scanner(System.in).next();  // 使用Scanner类的匿名对象
        System.out.print("请输入密码:");
        String password = new Scanner(System.in).next();

        // 4: 判断输入的用户名和密码与数组中管理员的用户名和密码是否一致,如果一致则可以更新密码
        for ( Administrator admin : administrators ) {
            // 判断用户名和原始密码与用户输入的是否一致
            if( admin.name.equalsIgnoreCase(name) && admin.password.equalsIgnoreCase(password)){
                // 修改标记变量的值
                flag = true;
                System.out.print("请输入您的新密码:");
                admin.password = new Scanner(System.in).next();
                break;  // 结束当前循环
            }
        }

        // 5: 根据标记变量给出相应的提示信息
        if( flag )
            System.out.println("请牢记您的新密码!");
        else
            System.err.println("抱歉,您输入的用户名和密码不存在!");

        // 6: 输出显示所有管理员密码
        System.out.println("所有管理员用户名和密码如下:");
        System.out.println("-----------------------------------");
        for (Administrator admin : administrators )
            admin.show();
        System.out.println("-----------------------------------");

    }
}
