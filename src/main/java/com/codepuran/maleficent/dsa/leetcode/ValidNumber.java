package com.codepuran.maleficent.dsa.leetcode;

import java.util.*;

public class ValidNumber {
    public static void main(String[] args) {
        ValidNumber validNumber = new ValidNumber();
        System.out.println("Result: " + validNumber.isNumber(" -."));
    }

//    public boolean isNumber(String s) {
//        try {
//            if(!s.isEmpty() &&
//                    (s.charAt(s.length()-1) == 'f' || s.charAt(s.length()-1) == 'F' || s.charAt(s.length()-1) == 'd' || s.charAt(s.length()-1) == 'D')
//            ){
//                return false;
//            }
//            Double.parseDouble(s);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//
//    }

//    public boolean isNumber(String s) {
//        if (s == null ||s.isEmpty()) return false;
//        int i = -1;
//        s = s.trim();
//        if (s == null ||s.isEmpty()) return false;
//        char sA [] = s.toCharArray();
//        if(s.charAt(0) == 'e'
//                || s.charAt(s.length()-1) == 'e') {
//            return false;
//        }
//        if(s.length() == 1 && s.charAt(0) == '.'){
//            return false;
//        }
//        int dotCount = 0;
//        if("-.".equals(s)) {
//            return false;
//        }
//        for(char c : sA){
//            i++;
//            if(c == '.'|| c== 'e' || (i == 0 && (c == '+' || c == '-')) || c == 'e'  || (c >= '0' && c<= '9')) {
//                if(c == '.') {
//                    dotCount++;
//                    if(dotCount > 1) {
//                        return false;
//                    }
//                }
//                if (c == '.' && ((( i < sA.length -1 && sA[i+1] == 'e') ||  ( i!= 0 && sA[i-1] == 'e')) || (( i < sA.length -1 && sA[i+1] == '.') ||  ( i!= 0 && sA[i-1] == '.'))
//                )){
//                    return false;
//                }
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

    //Alternate solution
    //   whitespace [+-] [0-9].[0-9]e[+-][0-9] whitespace
    // 0     1       2     3  4  5  6 9    7       8
    private Map<Integer, Integer>[] states = (Map<Integer, Integer>[]) new Map[] {
            map(' ', 1, '+', 2, '1', 3, '.', 4), // 0 start
            map(' ', 1, '+', 2, '1', 3, '.', 4), // 1 whitespace
            map('1', 3, '.', 4), // 2 +-
            map('1', 3, '.', 10, 'e', 6, ' ', 8), // 3 integral 0-9
            map('1', 5), // 4 decimal point
            map('1', 5, 'e', 6, ' ', 8), // 5 fractional 0-9
            map('1', 7, '+', 9), // 6 letter e
            map('1', 7, ' ', 8), // 7 exponent 0-9
            map(' ', 8), // 8 whitespace
            map('1', 7), // 9 +- before exponent
            map('1', 5, 'e', 6, ' ', 8) // 10 decimal point after [0-9]
    };
    private Set<Integer> exit = new HashSet<>(Arrays.asList(3, 5, 7, 8, 10));

    public boolean isNumber(String s) {
        int state = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c >= '0' && c <= '9') c = '1';
            if (c == '-') c = '+';

            Map<Integer, Integer> next = states[state];
            if (next.containsKey(c)) state = next.get(c);
            else return false;
        }
        return exit.contains(state);
    }

    private static Map<Integer, Integer> map(int... kv) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < kv.length; i += 2) {
            result.put(kv[i], kv[i + 1]);
        }
        return result;
    }
}
