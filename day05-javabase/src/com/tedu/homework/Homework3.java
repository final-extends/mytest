package com.tedu.homework;

/**
 *   作业3：
 *   使用嵌套循环打印输出 空心菱形 图形如下：
 *       *
 *      * *
 *     *   *
 *    *     *
 *   *       *
 *    *     *
 *     *   *
 *      * *
 *       *
 */
public class Homework3 {

    public static void main(String[] args) {
        // 分析:
        // 上半部分是一个等腰三角形,下半部分是一个倒等腰三角形，注意：两个等腰三角形是共用同一个底边
        // 1: 打印正等腰三角形
        // 1-1: 外循环：控制正等腰三角形的总行数
        for (int i = 1; i <= 5 ; i++) {

            // 1-2: 内循环1：控制正等腰三角形每一行打印的空格数量
            for (int j = 1; j <= 5 - i ; j++)
                System.out.print(" ");

            // 1-3: 内循环2：控制正等腰三角形每一行打印的*号数量
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                // 判断是否是头和尾部，如果是则打印*号，如果不是则打印空格
                if( j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // 2: 每打印完一行换行
            System.out.println();
        }

        // 3: 打印倒等腰三角形
        // 3-1: 外循环：控制倒等腰三角形的总行数
        for (int i = 1; i <= 4 ; i++) {

            // 3-2: 内循环1：控制倒等腰三角形每一行打印的空格数量
            for (int j = 1; j <= i ; j++)
                System.out.print(" ");

            // 3-3: 内循环2：控制倒等腰三角形每一行打印的*号数量
            for (int j = 1; j <= 9 - 2 * i; j++) {
                // 判断是否是头和尾部，如果是则打印*号，如果不是则打印空格
                if( j == 1 ||  j == 9 - 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // 4: 每打印完一行换行
            System.out.println();
        }
    }
}
