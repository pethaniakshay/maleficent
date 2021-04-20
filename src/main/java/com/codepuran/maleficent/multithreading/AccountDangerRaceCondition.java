package com.codepuran.maleficent.multithreading;

public class AccountDangerRaceCondition implements Runnable {
    Account account = new Account();
    public static void main(String[] args) {

        AccountDangerRaceCondition app = new AccountDangerRaceCondition();

        Thread ryan = new Thread(app, "ryan");
        Thread tracy = new Thread(app, "tracy");

        ryan.start();
        tracy.start();
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            makeWithdrawal(10);
            if(account.getBalance() < 0) {
                System.out.println(Thread.currentThread().getName()+ ": Account overdrawn ");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount){
        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.withdraw(10);

            System.out.println(Thread.currentThread().getName() + " has completed withdraw");
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}


class Account {
    private int balance = 90;

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amount){
        this.balance -= amount;
     }
}