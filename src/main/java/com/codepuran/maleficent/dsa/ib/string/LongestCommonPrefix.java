package com.codepuran.maleficent.dsa.ib.string;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println("Hello");
        LongestCommonPrefix lcp = new LongestCommonPrefix();
    }

    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder longestPrefix = new StringBuilder("");
        int pointor = 0;
        if(!A.isEmpty()){
            String firstString = A.get(0);
            if(firstString.isEmpty()){
                return "";
            }
            while (true) {
                if(pointor < firstString.length()){
                    char currentChar = firstString.charAt(pointor);
                    for(String eachString : A) {
                        if(pointor < eachString.length()){
                            if(eachString.charAt(pointor) != currentChar){
                                return longestPrefix.toString();
                            }
                        } else {
                            return longestPrefix.toString();
                        }
                    }
                    longestPrefix.append(currentChar);
                    pointor++;
                } else {
                    return longestPrefix.toString();
                }
            }
        }
        return longestPrefix.toString();
    }

}
