package com.codepuran.maleficent.dsa.leetcode;

public class AtoI {

    public static void main(String[] args) {
        AtoI atoI = new AtoI();
        System.out.println("Result: "  + atoI.myAtoi("-5-"));
    }

    public int myAtoi(final String A) {
        if(A == null) {
            return 0;
        }
        String B = A.trim();
        String newString = "";
        int i = -1;
        for(char s : B.toCharArray()){
            i++;
            if( i == 0 && s == '+'){
                continue;
            }
            if(i == 1 && (s == '-' || s == '+')) break;
            if (( i == 0 && s == '-') || (s >= '0' && s<= '9')) {
                newString = newString + s;
            } else {
                break;
            }
        }
        if(newString.isEmpty() || (newString.length() == 1 && newString.charAt(0) == '-')) {
            return 0;
        }
        try {
            return Integer.parseInt(newString);
        } catch (NumberFormatException ex) {
            if(newString.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}
