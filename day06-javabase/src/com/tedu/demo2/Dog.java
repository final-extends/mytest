package com.tedu.demo2;

/**
 *
 *    宠物狗类
 */
public class Dog {
    // 属性
    String name;  // 昵称
    int health = 100;   // 健康度
    int love = 0;     // 亲密度
    String strain;  // 品种

    // 宠物独白
    public void print(){
        System.out.println("我的名字叫:"+name+",健康度是:"+health+",与主人亲密度是:"+love+",品种是:"+strain);
    }
}
