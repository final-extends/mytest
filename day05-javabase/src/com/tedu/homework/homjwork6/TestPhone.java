package com.tedu.homework.homjwork6;

// 测试电话类
public class TestPhone {

    public static void main(String[] args) {
        // 1: 声明一个电话类对象
        Phone iPhone= new Phone();
        // 2: 给电话类对象的属性赋值
        iPhone.brand = "iPhone13 Pro MAX";

        // 3: 调用手机的下载音乐方法
        iPhone.downloadMusic();

        // 4: 调用手机的播放音乐的方法
        iPhone.playMusic();

        // 5: 调用手机的充电方法
        iPhone.charging();
    }
}
