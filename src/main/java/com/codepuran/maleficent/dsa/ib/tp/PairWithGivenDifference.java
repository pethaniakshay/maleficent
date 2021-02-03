package com.codepuran.maleficent.dsa.ib.tp;

import java.util.ArrayList;
import java.util.HashSet;

public class PairWithGivenDifference {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public int solve(ArrayList<Integer> A, int B) {

       /* if(A.size() == 2) {
            if(A.get(0) - A.get(1) == B || A.get(0) - A.get(1) == (-1*B)) {
                return 1;
            }
        }*/

        /*for(int i= 0 ; i< A.size() ; i++) {
            int expectedJ = A.get(i) + B;
            for(int j = i+1 ; j < A.size() ; j++) {
                if(A.get(j) == expectedJ || A.get(j) == (-1*expectedJ)) {
                    return 1;
                }
            }
        }*/


        HashSet<Integer> set = new HashSet<Integer>();

        for(int n : A){
            if(set.contains(n)){
                return 1;
            } else {
                set.add(n+B);
                set.add(n-B);
            }
        }

        /*int i = 0;
        int j = i+1;
        int p = A.size()-1;
        int q = p-1;
        while (i < A.size() || p >=0) {
            while (j < A.size() || q >= 0) {
                if(( A.get(i) - A.get(j) == B || A.get(j) - A.get(i) == B)) {
                    return 1;
                }
                if(( A.get(p) - A.get(q) == B || A.get(q) - A.get(p) == B)) {
                    return 1;
                }
                ++j;
                --q;
            }
            ++i;
            --p;
        }*/

       /* for(int i= 0 ; i< A.size() ; i++) {
            for(int j = i+1 ; j < A.size() ; j++) {
                if(A.get(i) - A.get(j) == B || A.get(i) - A.get(j) == (-1*B)) {
                    return 1;
                }
            }
        }*/
        return 0;
    }
}
