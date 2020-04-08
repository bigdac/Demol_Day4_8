package com.li.demol_day4_8.demo2;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 22
 * 描述：volatile 的例子 可以看出线程可见性
 */
public class VolatileDemo {

    public static void main(String[] args) {
        ThreadTestDemo ttd = new ThreadTestDemo();
        new Thread(ttd).start();
        while(true){
            if(ttd.isFlag()){
                System.out.println("------------------");
                break;
            }
        }
//        不加volatile 输出为   flag=true

//        加 volatile 输出为    ------------------
//                              flag=true


    }
}
class ThreadTestDemo implements Runnable {
//    private volatile boolean flag = false;
    private  boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        flag = true;
        System.out.println("flag=" + isFlag());
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
