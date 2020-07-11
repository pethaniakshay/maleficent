package com.codepuran.maleficent.dsa.leetcode;

public class BalancedStringSplit {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }



    public int balancedStringSplit(String s) {

        char current = Character.MIN_VALUE;
        if(!s.isEmpty()){
            current = s.charAt(0);
        }
        int matchingPair = 0;
        int currentOccurrence = 0;
        int currentOppositeOccurrence = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == current){
                currentOccurrence ++;
            } else {
                currentOppositeOccurrence ++;
            }
            if(currentOccurrence <= currentOppositeOccurrence) {
                if(i < s.length() -1){
                    current = s.charAt(i+1);
                }
                currentOccurrence = 0;
                currentOppositeOccurrence = 0;
                matchingPair++;
            }
        }
        return matchingPair;
    }
}
