package com.li.demol_day4_8.demo1;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 21
 * 描述：1.单例 模式 恶汉式
 */
public class SingleDemo {
    public static SingleDemo mInstance = new SingleDemo();

    private SingleDemo(){

    }

    public static SingleDemo getmInstance() {
        return mInstance;
    }
}
