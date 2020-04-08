package com.li.demol_day4_8.demo2;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 21
 * 描述：2.单例模式 懒汉式（2） 解决 懒汉（1）的问题
 *   优点： 利用锁解决（1）线程安全问题
 *  问题：  每次调用都判断锁引起效率问题
 */
public class SingleDemo1 {

    private static SingleDemo1 mInstance ;

    private SingleDemo1(){

    }

    public static synchronized SingleDemo1 getmInstance() {
        if (mInstance==null){//线程a进入还没有new SingleDemo（）， b进入 mInstance为空 ab都创建了实例
            mInstance = new SingleDemo1();
        }
        return mInstance;
    }
}
