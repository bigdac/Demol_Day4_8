package com.li.demol_day4_8.demo2;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 21
 * 描述：2.单例模式 懒汉式（3） 解决 懒汉（2）的问题
 *   优点：  既保证线程安全效率也较高
 *  问题：  还会可能出现多线程并发的问题,可能还是会存在多个实例
 */
public class SingleDemo2 {

    private static SingleDemo2 mInstance ;

    private SingleDemo2(){

    }


    public static SingleDemo2 getmInstance() {
        if (mInstance==null){ //判断为空进来
            synchronized (SingleDemo2.class){//加锁保证线程安全 只有1个能进入
                if (mInstance==null){//再次判断是否为空，是空创建  创建后mInstance不为空 无法进入到synchronized锁里面来
                    mInstance = new SingleDemo2();
                }
            }

        }
        return mInstance;
    }
}
