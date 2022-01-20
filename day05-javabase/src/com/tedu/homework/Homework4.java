package com.tedu.homework;

import java.util.Random;

/**
 *   作业4：
 *   要求用户随便输入 5 个数字 或 随机产生5个数值，然后对 5 个数值进行 升序\降序 排列（必须使用冒泡排序算法完成）
 */
public class Homework4 {
    public static void main(String[] args) {
        // 分析:
        // 1: 声明一个保存5位数字的数组
        int[] numbers = new int[5];

        // 2: 声明一个随机对象
        Random random = new Random();

        // 3: 循环随机5个数值并保存到数组元素中
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(100);

        // 4: 输出显示数组中5个随机数
        System.out.println("5个数值如下:");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i]+"\t");

        // 5: 采用冒泡排序方法对数组中的元素进行升序或降序排列
        // 外循环：控制比较的轮次
        for (int i = 0; i < numbers.length ; i++) {
            // 内循环: 控制每一轮比较的次数,每比较完一轮则少比较一次
            for (int j = 0; j < numbers.length - i - 1; j++) {
                // 将数组临近的两个数值进行比较,然后判断并交换数值
                if( numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        // 6: 输出排序后数组中的所有元素
        System.out.println("\n数组排序后效果如下:");
        for ( int number:numbers )
            System.out.print(number+"\t");

    }
}
