package com.codepuran.maleficent.multithreading;

public class ThreadClassExample extends Thread{

    public int count = 0;

    public void run() {
        System.out.println("Thread started");
        try {
            while (count < 5) {
                System.out.println("Sleeping from thread");
                Thread.sleep(500);
                ++count;
            }
        } catch (InterruptedException e) {
            System.out.println("thread interrupted ");
        }
        System.out.println("thread terminating");
    }
}
