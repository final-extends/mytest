package com.tedu.demo1;

import java.util.Scanner;

/**
 *   要求用户输入一段歌词，然后将此段歌词拆分成多行进行显示
 *   // 采用 split() 方法完成
 */
public class StringDemo3 {

    public static void main(String[] args) {
        // 输出对象
        Scanner in = new Scanner(System.in);
        // 提示用户输入一段歌词，歌词段落之间以空格隔开，然后保存到歌词的字符串变量中
        System.out.println("请输入一段歌词,歌词之间使用空格隔开:");
        String song = in.nextLine();
        // 以空格的方式拆分目标字符串,将拆分后的字符串内容保存到字符串数组中
        String[] songs = song.split(" ");
        // 将字符串以每行的方式进行输出显示
        for ( String s:songs )
            System.out.println(s);
    }
}
