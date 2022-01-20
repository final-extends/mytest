package com.tedu.demo2;

/**
 *   宠物企鹅类
 */
public class Penguin {
    // 属性
    String name;
    int health = 100;
    int love = 0;
    String sex;   // 性别属性

    // 宠物独白的方法
    public void print(){
        System.out.println("我的名字叫:"+name+",健康度是:"+health+",与主人亲密度是:"+love+",性别是:"+sex);
    }
}
