package com.tedu.demo1;

import java.util.Scanner;

/**
 *    StringBuffer类的 append() 方法的使用
 */
public class StringBufferDemo2 {

    public static void main(String[] args) {
        // 输入对象
        Scanner in = new Scanner(System.in);
        // 声明一个StringBuffer类对象
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        // 要求用户输入一段内容
        System.out.print("请输入一个同学的名字:");
        stringBuffer.append(in.next());
        // 输出显示最终内容
        System.out.println(stringBuffer);
    }
}
