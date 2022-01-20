package com.tedu.homework.homework5;

// 测试类
public class TestAdministrator {

    public static void main(String[] args) {
        // 1: 声明一个管理员类对象
        Administrator administrator = new Administrator();
        Administrator administrator2 = new Administrator();

        // 2: 给管理员类对象进行赋值
        administrator.name = "郭俊杰";
        administrator.password = "666666";

        administrator2.name = "张小龙";
        administrator2.password = "888888";

        // 3: 调用管理员对象显示用户名和密码的方法
        administrator.show();
        administrator2.show();
    }
}
