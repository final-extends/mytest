package com.tedu.demo1;

import java.util.Scanner;

/**
 *   StringBuffer类的 insert() 方法
 *   问题:
 *      将一个数字字符串转换成逗号分隔的数字串，即从右边开始每三个数字用逗号分隔
 */
public class StringBufferDemo3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 声明一个保存数字的 StringBuffer 对象
        StringBuffer stringBuffer = new StringBuffer();

        // 提示用户输入一串数字
        System.out.print("请输入一串数字:");
        stringBuffer.append(in.next());

        // 根据每3位数字插入一个符号，利用for循环来完成
        for (int i = stringBuffer.length() - 3; i > 0 ; i-=3)
            stringBuffer.insert(i,",");

        // 输出显示最终的效果
        System.out.println("插入指定字符后效果为:"+stringBuffer);
    }
}
