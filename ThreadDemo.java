package com.hy.thread.t1;

/**
 * �̳�Thread��ķ�ʽʵ�ֶ��߳���ʾ
 * 
 * @author 007
 *
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running ... "); // ��ӡ��ǰ�̵߳�����
            try {
                Thread.sleep(1000); // ��Ϣ1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.start(); // �����߳�

        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running ... "); // ��ӡ��ǰ�̵߳�����
            try {
                Thread.sleep(1000); // ��Ϣ1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}