package com.tedu.demos;

/**
 *  强制类型转换
 */
public class JavaDemo10 {

    /**
     *   整数类型与字符类型之间所牵扯的是 ASCII 码
     * @param args
     */
    public static void main(String[] args) {
        // 声明两个不同类型的变量
        int number;
        char chr = 'c';

        // 自动类型转换
        // number  = chr;

        // 强制类型转换
        number = 88;
        chr = (char)number;

        System.out.println("chr="+chr+"\tnumber="+number);
    }
}
