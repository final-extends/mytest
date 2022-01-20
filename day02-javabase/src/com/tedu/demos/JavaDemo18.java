package com.tedu.demos;

import java.util.Scanner;

/**
 *   判断元音字母 a、e、i、o、u
 */
public class JavaDemo18 {

    public static void main(String[] args) {
        // 1: 声明输入对象
        Scanner in = new Scanner(System.in);
        // 2: 声明一个变量用于保存名次
        char chr;
        // 3: 提示用户输入名次并保存到变量中
        System.out.print("请输入一个英文字母:");
        chr = in.next().charAt(0);
        // 4: 利用switch结构来判断是否为元音字母
        switch (chr){
            case 'u':
                System.out.println("是元音字母u");
                break;
            case 'a':
                System.out.println("是元音字母a");
                break;
            case 'e':
                System.out.println("是元音字母e");
                break;
            case 'i':
                System.out.println("是元音字母i");
                break;
            default:
                System.out.println("您输入的不是元音字母!");
                break;
            case 'o':
                System.out.println("是元音字母o");
                break;
        }
    }
}
