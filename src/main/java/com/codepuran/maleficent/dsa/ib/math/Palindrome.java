package com.codepuran.maleficent.dsa.ib.math;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println("Result: " + palindrome.isPalindrome(""));
    }

    public int isPalindrome(String A) {
        A  = A.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int len = A.length();
        int f = 0;
        int b = len-1;
        while(f < len/2){
            if(A.charAt(f) != A.charAt(b)){
                return 0;
            }
            f++;
            b--;
        }
        return 1;
    }
}
