package com.codepuran.maleficent.dsa.ib;

import com.codepuran.maleficent.dsa.ib.math.Palindrome;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println("Result: ");
    }

    public void reverseString(char[] s) {
        int len = s.length;
        int f = 0;
        int b = len-1;
        char temp;
        while(f < len/2){
            temp = s[f];
            s[f] = s[b];
            s[b] = temp;
            f++;
            b--;
        }

    }
}
