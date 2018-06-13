package com.hy.thread.t1;

/**
 * 继承Thread类的方式实现多线程演示
 * 
 * @author 007
 *
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running ... "); // 打印当前线程的名字
            try {
                Thread.sleep(1000); // 休息1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.start(); // 启动线程

        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running ... "); // 打印当前线程的名字
            try {
                Thread.sleep(1000); // 休息1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}