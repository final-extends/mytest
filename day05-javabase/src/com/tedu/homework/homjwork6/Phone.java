package com.tedu.homework.homjwork6;


/**
 *   编写手机类（Phone）
 * 	   可以下载音乐，可以播放这些音乐，可以进行充电
 * 	   重用电池类方法（Cell）
 * 	   编写测试类（TestPhone）
 *
 */
// 定义一个电话类型
public class Phone {

    // 属性
    String brand;  // 品牌
    Cell cell = new Cell();  // 电池类对象

    // 下载音乐的方法
    public void downloadMusic(){
        System.out.println("正在下载音乐....");
    }

    // 播放音乐
    public void playMusic(){
        System.out.println("正在播放音乐...");
    }

    // 充电方法
    public void charging(){
        cell.brand = "飞利浦";
        cell.battery();  // 调用电池的蓄电方法
    }


}
