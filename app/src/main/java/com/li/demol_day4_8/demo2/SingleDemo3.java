package com.li.demol_day4_8.demo2;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 21
 * 描述：2.单例模式 懒汉式（4） 解决 懒汉（3）的问题 终极版
 *   优点：  既保证线程安全效率也较高 加 volatile字段
 *  问题：
 */
public class SingleDemo3 {
//    volatile字段作用
    /*   1.防止重新排序的问题
        java 正常初始化排序
        （1）开辟内存空间
         (2) 初始化对象
        （3）给变量赋值（指向内存的地址）
        java 可能出现的排序 2.3是可换的
          先赋值在初始化对象 就会出现mInstance不为null 从而没有new的情况没有初始化
    *    2.线程可见性 因为每一个线程都有各自的缓存区在改变对象时可能出现改变变量，
    *    短时间另一个线程可能是不可见的（试例）
    * */

    private static volatile SingleDemo3 mInstance ;

    private SingleDemo3(){

    }

    public static synchronized SingleDemo3 getmInstance() {
        if (mInstance==null){ //判断为空进来
            synchronized (SingleDemo3.class){//加锁保证线程安全 只有1个能进入
                if (mInstance==null){//再次判断是否为空，是空创建  创建后mInstance不为空 无法进入到synchronized锁里面来
                    mInstance = new SingleDemo3();
                }
            }

        }
        return mInstance;
    }
}
