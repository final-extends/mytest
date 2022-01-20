package com.tedu.demo2;

import java.util.Scanner;

/**
 *  测试类
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎光临宠物商店");
        // 保存用户输入的宠物的名称变量
        System.out.println("请输入要领养宠物的名字:");
        String name = in.next();
        // 保存用户选择宠物类型的变量
        System.out.print("请输入要领养宠物的类型(1: 宠物狗    2:宠物企鹅):");
        int number = in.nextInt();
        // 判断用户选择的宠物类型
        if( number == 1 ){  // 选择的是宠物狗类型
            // 实例化一个宠物狗对象
            Dog dog = new Dog();  // 对象的有限范围在 if 中
            // 将宠物名称赋值到宠物狗的昵称属性上
            dog.name = name;
            // 提示用户选择要领养的宠物狗的品种
            System.out.print("请选择宠物狗的品种(1: 聪明的拉布拉多   2:酷酷的雪纳瑞):");
            // 判断用户选择的宠物狗的品种
            if( in.nextInt() == 1 )
                dog.strain = "聪明的拉布拉多";
            else
                dog.strain = "酷酷的雪纳瑞";
            System.out.println("\n宠物的独白:");
            dog.print();  // 调用打印宠物信息的方法
        }else if( number == 2 ){  // 选择的是宠物企鹅类型
            // 实例化一个宠物企鹅对象
            Penguin penguin = new Penguin();
            // 将宠物名赋值到宠物企鹅的昵称属性上
            penguin.name = name;
            // 提示用户选择让要领养宠物企鹅的性别
            System.out.println("请选择宠物企鹅的性别(1: Q仔   2:Q妹):");
            // 判断用户选择的宠物企鹅的性别
            if(in.nextInt() == 1)
                penguin.sex = "Q仔";
            else
                penguin.sex = "Q妹";
            System.out.println("\n宠物的独白:");
            penguin.print();  // 调用打印宠物信息的方法
        }else
            System.err.println("您选择的宠物类型本店没有!");
    }
}
