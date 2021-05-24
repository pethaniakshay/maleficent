package com.codepuran.maleficent.j8;

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);

        int noOfLines = sc.nextInt();
        sc.close();

        List<String> a = new ArrayList<>();

        for(int i= 1; i<= noOfLines ; i++); {
           String s =  sc.next();
           a.add(s);
        }

        for(String s: a) {
            Map<Character,Integer> aa = new HashMap<>();
            for(char c : s.toCharArray()) {
                if(aa.containsKey(c)) {
                    int z = aa.get(c);
                    aa.put(c, z+1);
                } else {
                    aa.put(c, 1);
                }
            }
            Character high = 'a';
            for (Map.Entry<Character,Integer> entry : aa.entrySet()) {
                Integer h = aa.get(high);
                if(h == null) {
                    break;
                }

                if(entry.getKey() != high && entry.getValue() >= h && entry.getKey() > high) {
                    high = entry.getKey();
                }
            }
            System.out.println(high);
        }
   }


}
