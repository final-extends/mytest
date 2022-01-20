package com.tedu.homework.homework5;

/**
 *  作业5：
 *       5-1：编写管理员类Administrator
 *       5-2：编写管理员类的属性 name（用户名） 和 password（密码）
 *       5-3：编写管理员信息显示的方法show()，该方法显示对应管理员的 用户名 和 密码
 *
 *       提示：可以声明一个管理员类型的数组，然后通过循环来查找对应的管理员账号，
 *            如果账号对上了再要求输入旧密码，如果旧密码输入正确才能输入新的管理员密码并更新管理员信息
 */

// 定义管理员类
public class Administrator {
    // 编写管理员类的属性
    String name;  // 用户名属性
    String password;   // 密码属性

    // 定义管理员类中的show方法,用于显示对应管理员的用户名和密码
    public void show(){
        System.out.println("用户名:"+name+"\t密码:"+password);
    }
}
