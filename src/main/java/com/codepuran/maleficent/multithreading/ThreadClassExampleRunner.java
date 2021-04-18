package com.codepuran.maleficent.multithreading;

public class ThreadClassExampleRunner {

    public static void main(String[] args) {
        ThreadClassExample instance = new ThreadClassExample();
        instance.start();
        while (instance.count !=5) {
            try {
                System.out.println("Sleeping thread from main thread");
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
