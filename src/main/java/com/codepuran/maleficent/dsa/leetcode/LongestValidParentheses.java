package com.codepuran.maleficent.dsa.leetcode;

import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int longest = 0;
        int currentSize = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            Character c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty()) {
                stack.pop();
                currentSize = currentSize + 2;
            } else if(c == ')' && stack.isEmpty()) {
                if(currentSize > longest) {
                    longest = currentSize;
                }
                currentSize = 0;
            }
        }
        if(currentSize > longest) {
            longest = currentSize;
        }
        return longest;
    }
}
