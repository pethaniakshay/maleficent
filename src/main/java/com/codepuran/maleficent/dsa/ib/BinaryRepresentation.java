package com.codepuran.maleficent.dsa.ib;

import java.util.ArrayList;

public class BinaryRepresentation {

    public static void main(String[] args) {
        System.out.println(findDigitsInBinary(5));
    }

    public static String findDigitsInBinary(int A) {

        if(A == 0) {
            return "0";
        }
        if(A == 1) {
            return "1";
        }
        String ans = "";
        while (A > 0) {
           int singlePlace =  A % 2;
           A = A/2;
           ans = singlePlace + ans;
        }
        return ans;

    }
}
