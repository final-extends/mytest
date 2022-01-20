package com.tedu.homework;

/**
 *    作业1：
 *    使用嵌套循环打印输出 等腰三角形 图形如下：
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 */
public class Homework1 {

    public static void main(String[] args) {
        // 1: 使用嵌套循环来完成
        // 1-1: 外循环：控制总的行数
        for (int i = 1; i <= 5 ; i++) {

            // 1-2: 内循环1：控制每一行打印的空格数量
            for (int j = 1; j <= 5 - i ; j++)
                System.out.print(" ");

            // 1-3: 内循环2：控制每一行打印的星号数量
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");

            // 2: 每打印完一行换行
            System.out.println();
        }
    }
}
