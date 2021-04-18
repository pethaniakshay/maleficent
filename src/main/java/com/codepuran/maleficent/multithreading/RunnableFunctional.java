package com.codepuran.maleficent.multithreading;

public class RunnableFunctional {

    public static void main(String[] args) {
        Runnable r = () ->  {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runnable thread is running");
        };

        Thread anotherThread = new Thread(() -> System.out.println("Even simpler way to start a thread"));

        Thread thread = new Thread(r);
        System.out.println("Before calling runnable run");
        thread.start();
        anotherThread.start();
        System.out.println("After calling runnable run");
    }
}
