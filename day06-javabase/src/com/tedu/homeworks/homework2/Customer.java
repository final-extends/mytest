package com.tedu.homeworks.homework2;

/**
 *   客户类型
 */
public class Customer {

    // 属性
    String name;
    int age;
    double score;

    // 显示客户个人的信息方法
    public void showInfo(){
        System.out.println(name+"\t"+age+"\t"+score);
    }
}
