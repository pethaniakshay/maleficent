package com.codepuran.maleficent.dsa.ib;

import java.util.ArrayList;

public class PrettyPrint {

    public static void main(String[] args) {
        int A = 2;
        ArrayList<ArrayList<Integer>> prettyMetrix = prettyPrint(A);
        for(ArrayList<Integer> row : prettyMetrix) {
            for (Integer i : row) {
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> prettyMetrix = new ArrayList<>();
        int dimention = A + (A-1);
        int sir = A;
        String direction = "down";
        for(int i= dimention ; i > 0 ; i--) {
            ArrayList<Integer> row = new ArrayList<>();
            int print = A;
            int sirPrintCount = sir + (sir-1);
            String sirDirection = "minus";
            for(int j = dimention; j> 0 ; j--){
                row.add(print);
                if( (sir == print) && sirPrintCount > 1) {
                    sirPrintCount --;
                } else if(sirDirection == "minus"){
                    print --;
                } else if(sirDirection == "plus") {
                    print ++;
                }
                if(print == sir) {
                    sirDirection = "plus";
                }
            }
            if(direction == "down"){
                sir = sir - 1;
            }
            if(direction == "up") {
                sir = sir + 1;
            }
            if(sir == 1) {
                direction = "up";
            }
            prettyMetrix.add(row);
        }
        return prettyMetrix;
    }
}
