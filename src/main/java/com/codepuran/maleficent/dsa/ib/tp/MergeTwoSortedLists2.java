package com.codepuran.maleficent.dsa.ib.tp;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedLists2 {

    public static void main(String[] args) {
        System.out.println("Hello World");
         var mtsl2 = new MergeTwoSortedLists2();
         var a = new ArrayList<>(Arrays.asList(1,2));
         var b = new ArrayList<>(Arrays.asList(-1,2));
         mtsl2.merge(a,b);

        System.out.println(a);

    }

    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        if( a.size() == 0) {
            a.addAll(b);
        } else if(b.size() != 0){

            int j = 0;
            int i = 0;

            while(i < a.size()) {
                if(b.get(j) <= a.get(i)) {
                    a.add(i,b.get(j));
                    ++j;
                }
                ++i;

                if(j >= b.size()) {
                    break;
                }
            }
            while (j < b.size()) {
                a.add(b.get(j));
                ++j;
            }
        }
    }
}
