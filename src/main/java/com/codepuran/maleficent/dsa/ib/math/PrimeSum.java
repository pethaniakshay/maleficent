package com.codepuran.maleficent.dsa.ib.math;

import java.util.ArrayList;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(15));
    }

    public static ArrayList<Integer> primesum(int A) {

        ArrayList<Integer> result = new ArrayList<>();

        ArrayList<ArrayList<Integer>> interMediateResult = new ArrayList<>();

        int upperLimit = A;
        for (int i=2; i <= upperLimit ; i++) {
            ArrayList<Integer> interMediateSol = new ArrayList<>();
            if (isPrime(i)) {
                int another = A - i;
                if(isPrime(another)){
                    interMediateSol.add(i);
                    interMediateSol.add(another);
                    upperLimit = another;
                    interMediateResult.add(interMediateSol);
                }
            }

        }

        if(!interMediateResult.isEmpty()) {
            result = interMediateResult.get(0);
            for(ArrayList<Integer> inMeteResult : interMediateResult) {
                if(result.get(0) <=  inMeteResult.get(0) && result.get(1) <  inMeteResult.get(1)){
                    result = inMeteResult;
                } else {

                }
            }
        }
        return result;
    }


    public static boolean isPrime(int A) {
        if(A == 1) {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(A); i++) {
            if(A % i == 0) {
                return false;
            }
        }
        return true;
    }

}
