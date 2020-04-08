package com.li.demol_day4_8.demo2;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 21
 * 描述：2.单例模式 懒汉式（1）
 *   优点： 只有使用时才加载 效率更高
 *  问题： 多并发可能会有多个实例
 */
public class SingleDemo {

    private static SingleDemo mInstance ;

    private SingleDemo(){

    }

    public static SingleDemo getmInstance() {
        if (mInstance==null){//线程a进入还没有new SingleDemo（）， b进入 mInstance为空 ab都创建了实例
            mInstance = new SingleDemo();
        }
        return mInstance;
    }
}
