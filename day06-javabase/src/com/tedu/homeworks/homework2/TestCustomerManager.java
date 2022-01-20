package com.tedu.homeworks.homework2;

import java.util.Scanner;

/**
 *   测试类
 */
public class TestCustomerManager {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1:实例化一个客户管理类对象
        CustomerManager cm = new CustomerManager();
        // 2:提示用户输入客户的信息
        do{
            // 3: 实例化一个客户类对象（此语句非常关键）
            Customer customer = new Customer();
            // 4: 提示用户输入客户的信息并保存到客户对象的属性上
            System.out.print("请输入客户的姓名:");
            customer.name = in.next();
            System.out.print("请输入客户的年龄:");
            customer.age = in.nextInt();
            System.out.print("请输入客户的积分:");
            customer.score = in.nextDouble();

            // 5: 调用添加客户信息的方法
            cm.addNewCustomer(customer);

            // 6: 询问用户是否继续
            System.out.print("\n继续录入吗?<y/n>:");
        }while( in.next().equalsIgnoreCase("y") );

        // 7: 显示所有客户的信息
        cm.showAll();

        // 8: 调用对客户积分排序的方法
        cm.sort();

        // 9: 显示所有客户积分排序后的信息
        cm.showAll();
    }
}
