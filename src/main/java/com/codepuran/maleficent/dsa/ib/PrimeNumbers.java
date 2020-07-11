package com.codepuran.maleficent.dsa.ib;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> sieve(int A) {

        ArrayList<Integer> result = new ArrayList<>();
        outer: for(int i=2; i<= A ; i++) {
            for(int j=2; j<= Math.sqrt(i); j++){
                if(i % j == 0) {
                    continue outer;
                }
            }
            result.add(i);
        }
        return result;
    }
}
