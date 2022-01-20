package com.tedu.demo1;

import java.util.Scanner;

/**
 *   提取输入的 文件名 和 文件扩展名
 *      使用 indexOf() 和 substring() 方法完成
 */
public class StringDemo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1: 创建一个保存用户输入的 文件名和 扩展名 字符串变量  // TestJava.java
        String fileName;
        System.out.print("请输入一个文件名(包括文件扩展名):");
        fileName = in.next();
        // 2: 查找字符串中"."出现位置并保存到变量中
        int index = fileName.indexOf(".");
           // 判断"."符号的位置是否是 -1
        if( index < 0 ){
            System.err.println("文件名输入不正确,文件扩展名必须要有\".\"符号存在!");
        }else {
            // 3: 从字符串0的下标位置开始截取，到“.”的位置结束则是文件名
            System.out.println("文件名是:"+fileName.substring(0,index));
            // 4: 从"."的位置开始，截取到字符串末尾处得到的是文件扩展名
            System.out.println("文件的扩展名是:"+fileName.substring(index));
        }
    }
}
