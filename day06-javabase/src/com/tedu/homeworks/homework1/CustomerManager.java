package com.tedu.homeworks.homework1;

/**
 *    需求说明
 *
 *         客户信息包括：姓名、年龄、积分
 *                 实现添加客户信息
 *                 实现所有客户信息显示
 *                 对客户的积分进行排序（升序、降序）
 *
 *          实现方式：
 *                   A、使用 多个“数组”来完成 *
 *
 *          推荐使用：数组作为方法参数 和 对象作为方法参数 来完成
 */
public class CustomerManager {

    // 属性部分
    String names[] = new String[300];
    int ages[] = new int[300];
    double scores[] = new double[300];

    // 添加客户信息的方法
    public void addNewCustomer(String name,int age,double score){
        // 通过循环在数组中查找空位置,以此来保存客户的信息
        for (int i = 0; i < names.length; i++) {
            // 判断数组元素上是否有空位置
            if( names[i] == null ){
                names[i] = name;
                ages[i] = age;
                scores[i] = score;
                break;  // 结束当前的循环,添加1个客户信息成功
            }
        }
    }

    // 显示所有客户信息的方法
    public void showAll(){
        System.out.println("\n姓名\t年龄\t积分");
        System.out.println("--------------------------------");
        // 通过循环显示所有客户信息，但只显示有名称客户信息
        for ( int i = 0;i < names.length;i++ ) {
            // 判断数组元素上不为空则显示对应客户信息
            if( names[i] != null)
                System.out.println(names[i]+"\t"+ages[i]+"\t"+scores[i]);
        }
        System.out.println("--------------------------------");
    }

    // 对客户的积分进行排序
    public void sort(){
        // 循环来排序
        // 外循环：控制比较的轮次
        for (int i = 0; i < names.length; i++) {
            // 内循环：控制每一轮比较的次数
            for (int j = 0; j < names.length - i - 1; j++) {
                // 判断数组元素不能为空
                if(names[j] != null){
                    // 判断临近两个积分,如果满足条件则进行换位
                    if( scores[j] < scores[j+1]){
                        double score = scores[j];
                        scores[j] = scores[j+1];
                        scores[j+1] = score;

                        String name = names[j];
                        names[j] = names[j+1];
                        names[j+1] = name;

                        int age = ages[j];
                        ages[j] = ages[j+1];
                        ages[j+1] = age;
                    }
                }
            }
            // 判断如果元素为空则结束当前循环
            if( names[i] == null )
                break;
        }

    }
}
