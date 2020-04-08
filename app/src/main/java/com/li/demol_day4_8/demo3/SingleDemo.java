package com.li.demol_day4_8.demo3;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 22
 * 描述：单例模式 静态内部类 (常用)
 */
public class SingleDemo {
    private SingleDemo(){

    }
    private static class SingleDemoHolder{
        private static volatile SingleDemo mInstance= new SingleDemo();
    }

    public static SingleDemo getInstance() {
        return SingleDemoHolder.mInstance;
    }

}
