package com.codepuran.maleficent.dsa.ib;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElement {

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1,2,13,6,8,5,7);
        int B = 2;
        System.out.println("Answer: " + kthsmallest(A,B));
    }

    public static int kthsmallest(final List<Integer> A, int B) {
        int k = 1;
        int smallestIntPosition = 0;
        int possibleSmallestIntPosition = -1;
        int i = 0;
        for(int element : A) {
            if(element < A.get(smallestIntPosition)) {
                smallestIntPosition = i;
            }
            ++i;
        }
        while (k < B) {
            for(int j = 0; j < A.size() ; j++ ) {
                if(j!= smallestIntPosition && (A.get(j) >= A.get(smallestIntPosition)) && (possibleSmallestIntPosition == -1 || A.get(j) <= A.get(possibleSmallestIntPosition))) {
                    possibleSmallestIntPosition = j;
                }
            }
            if(possibleSmallestIntPosition != -1)
                smallestIntPosition = possibleSmallestIntPosition;
            possibleSmallestIntPosition = -1;
            ++k;
        }
        return A.get(smallestIntPosition);
    }
}
