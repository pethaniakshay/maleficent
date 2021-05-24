package com.codepuran.maleficent.dsa.ib;

import java.util.ArrayList;
import java.util.Arrays;

public class NumRange {
    public static void main(String[] args) {

        var o = new NumRange();

        var r = o.numRange(new ArrayList<>(Arrays.asList(10, 5, 1, 0, 2)), 6 ,8);

        System.out.println("Result: " + r);
    }

    /*public int numRange(ArrayList<Integer> A, int B, int C) {
        int subsequences = 0;
        for(int i = 0; i < A.size() ; i++) {
            int currentSum = 0;
            for(int j = i ; j < A.size() ; j++) {
                currentSum = currentSum + A.get(j);
                if( B <= currentSum  && currentSum <= C) {
                    subsequences = subsequences + 1;
                } else if(currentSum > C) {
                    break;
                }
            }
        }
        return subsequences;
    }*/

    // Optimized solution O(N)
    public int count(ArrayList<Integer>A, int n, int k){
        int start = 0, end = 0;
        int count = 0;
        int sum = A.get(0);
        while(start < n && end < n){
            if( sum < k ){
                end++;
                if(start <= end){
                    count += end - start;
                }
                if(end < n){
                    sum += A.get(end);
                }
            }
            else{
                sum -= A.get(start);
                start++;
            }
        }
        return count;
    }

    public int numRange(ArrayList<Integer> A, int B, int C) {

        return count(A, A.size(), C + 1) - count(A, A.size(), B);

    }

}
