package com.tedu.homeworks.homework1;

import java.util.Scanner;

/**
 *   测试类
 */
public class TestCustomerManager {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String goon;
        // 1: 实例化一个客户管理类对象
        CustomerManager cm = new CustomerManager();
        // 2: 循环录入客户的信息,由客户来决定是否继续录入
        do{
            // 3: 提示用户输入对应的客户信息并接收保存到对应的变量中
            System.out.print("请输入客户的姓名:");
            String name = in.next();
            System.out.print("请输入客户的年龄:");
            int age = in.nextInt();
            System.out.print("请输入客户的积分:");
            double score = in.nextDouble();

            // 4: 调用添加客户信息的方法
            cm.addNewCustomer(name,age,score);

            // 5:询问用户是否继续添加其他客户的信息
            System.out.print("\n是否继续添加?<y/n>:");
            goon = in.next();

        }while( goon.equalsIgnoreCase("y") );

        // 6: 显示所有客户的信息
        cm.showAll();

        // 7: 调用排序的方法
        cm.sort();

        // 8: 再次显示客户的信息
        cm.showAll();
    }
}
