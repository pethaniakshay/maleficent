package com.codepuran.maleficent.dsa.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {

    private final LongestValidParentheses lvp = new LongestValidParentheses();

    @Test
    public void longestValidParentheses_Test_1(){
        String input = "()";
        int actual = lvp.longestValidParentheses(input);
        int expected = 2;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_2(){
        String input = "()()()()()(()()";
        int actual = lvp.longestValidParentheses(input);
        int expected = 10;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_3(){
        String input = "((())()()";
        int actual = lvp.longestValidParentheses(input);
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_4(){
        String input = "()(((()))()";
        int actual = lvp.longestValidParentheses(input);
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_5(){
        String input = "((";
        int actual = lvp.longestValidParentheses(input);
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_6(){
        String input = "))))((((";
        int actual = lvp.longestValidParentheses(input);
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_7(){
        String input = "(()((()(()(())))";
        int actual = lvp.longestValidParentheses(input);
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_8(){
        String input = "(((())))((((()))))((((()))))))())(())))))()(())(())(()(()())())(())(())(())(())(())(()(()))(()))))()()))(()";
        int actual = lvp.longestValidParentheses(input);
        int expected = "()(())(())(()(()())())(())(())(())(())(())(()(()))(())".length();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void longestValidParentheses_Test_9(){
        String input = "()(((()))()(()(";
        int actual = lvp.longestValidParentheses(input);
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }

}
