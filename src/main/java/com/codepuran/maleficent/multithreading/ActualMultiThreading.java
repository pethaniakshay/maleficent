package com.codepuran.maleficent.multithreading;

public class ActualMultiThreading {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i = 0 ; i < 3 ; i++) {
                System.out.println("Executing " + Thread.currentThread().getName() + " :" + i);
            }
        };

        Thread t1 = new Thread(r, "New York");
        Thread t2 = new Thread(r, "Pune");
        Thread t3 = new Thread(r, "London");

        t1.start();
        t2.start();
        t3.start();
    }
}
