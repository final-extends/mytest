package com.tedu.demo1;

/**
 *    toString() 方法的使用
 */
public class StringBufferDemo1 {

    public static void main(String[] args) {
        // 声明一个StringBuffer类对象并赋予一个初始值
        StringBuffer stringBuffer = new StringBuffer("中华人民共和国");
        // 将StringBuffer对象转换成String类型
        System.out.println("转换为String类型后是:"+stringBuffer.toString());
    }
}
