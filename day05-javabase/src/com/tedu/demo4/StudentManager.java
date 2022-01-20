package com.tedu.demo4;

/**
 *   学员管理的类
 */
public class StudentManager {
    // 属性定义: 定义一个可以接收并存放学员姓名的数组
    String[] names = new String[10];

    // 定义存储学员姓名的方法
    public void addName(String name){
        // 将姓名添加到数组中
        int i = 0;
        // 每次将传入的姓名只添加一次到数组中
        for (; i < names.length; i++) {
            // 1: 判断数组中的元素是否为 null
            if(names[i] == null) {
                // 2:将姓名存储到对应下标为空的元素中
                names[i] = name;
                break;  // 3: 添加完一个学生姓名后结束当前循环
            }
        }
        if( i == names.length )
            System.err.println("抱歉,学员姓名已经存满30人了!");
    }

    // 定义显示所有学员的姓名方法
    public void showNames(){
        System.out.println("序号\t姓名");
        System.out.println("-------------------------------");
        for (int i = 0; i < names.length; i++) {
            if( names[i] != null )  // 如果对应下标元素不为空则显示学员姓名
                System.out.println((i + 1) + "\t" + names[i]);
        }
        System.out.println("-------------------------------");
    }

    // 定义一个查找学生姓名的方法
    public boolean findName(String name){
        // 定义一个 boolean 类型的变量
        boolean find = false;  // 默认未找到

        // 怎么找？通过将参数 name 中的值与 names 数组中的值进行比较
        for (int i = 0; i < names.length; i++) {
            if(  names[i] != null && names[i].equalsIgnoreCase( name ) ){
                // 修改标记变量
                find = true;
                break;  // 结束当前循环,因为姓名已经找到，所以无需继续往下面继续查找了
            }
        }
        return find;
    }

}
