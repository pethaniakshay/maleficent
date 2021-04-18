package com.codepuran.maleficent.multithreading;

public class RunnableExample implements Runnable{

    public int count = 0;

    public static void main(String[] args) {
        RunnableExample instance = new RunnableExample();
        Thread thread = new Thread(instance);
        thread.start();

        while (instance.count !=5) {
            try {
                System.out.println("Sleeping thread from main thread");
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        System.out.println("Runnable thread started");
        try {
            while (count < 5) {
                System.out.println("Sleeping thread from runnable thread");
                Thread.sleep(500);
                ++count;
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable thread interrupted ");
        }
        System.out.println("Runnable thread terminating");
    }
}
