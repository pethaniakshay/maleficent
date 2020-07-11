package com.codepuran.maleficent.dsa.ib;

public class IsPrime {

    public static void main(String[] args) {

    }

    public int isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (A % i == 0) return 0;
        }
        return 1;
    }
}
