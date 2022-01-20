package com.tedu.homeworks.homework2;

/**
 *    需求说明
 *
 *         客户信息包括：姓名、年龄、积分
 *                 实现添加客户信息
 *                 实现所有客户信息显示
 *                 对客户的积分进行排序（升序、降序）
 *
 *          实现方式：
 *                   B、使用 “对象数组”来完成 *
 *
 *          推荐使用：数组作为方法参数 和 对象作为方法参数 来完成
 */
public class CustomerManager {

    // 客户类型的数组属性
    Customer[] customers = new Customer[300];  // 可以存放300个客户对象,但数组中显示什么都没有

    // 添加客户的方法
    public void addNewCustomer(Customer customer){
        // 通过循环去查找数组中的空位置,然后将客户对象添加到数组中进行保存
        for (int i = 0; i < customers.length; i++) {
            if( customers[i] == null ){
                // 添加客户
                customers[i] = customer;
                break; // 结束循环，结束添加
            }
        }
    }

    // 显示所有客户信息的方法
    public void showAll(){
        System.out.println("姓名\t年龄\t积分");
        System.out.println("----------------------------");
        for ( Customer c: customers ) {
            if( c != null )
                c.showInfo(); // 显示客户的个人信息
        }
        System.out.println("----------------------------");
    }

    // 对客户的积分进行排序的方法
    public void sort(){
        // 获得真实客户数量
        int count = getCustomerCount();
        // 外循环:控制比较的轮次
        for (int i = 0; i < count; i++) {
            // 内循环:控制每一轮比较的次数,每比较一轮则少比较一次
            for (int j = 0; j < count - i - 1; j++) {
                    // 比较临近的两个客户的积分
                    if( customers[j].score < customers[j+1].score ) {
                        // 判断临近的两个元素的积分,然后对客户对象进行换位
                        Customer temp= customers[j];
                        customers[j] = customers[j + 1];
                        customers[j + 1] = temp;
                    }
            }
        }
    }

    // 获得真实对象个数的方法
    public int getCustomerCount(){
        int count = 0;
        for (Customer c:customers) {
            if(c != null)
                count++;  // 累加计数1
        }
        return count;
    }
}
