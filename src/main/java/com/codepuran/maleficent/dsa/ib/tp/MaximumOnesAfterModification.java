package com.codepuran.maleficent.dsa.ib.tp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumOnesAfterModification {

    public int solution(ArrayList<Integer> A, int B) {
        int maxOnes = 0, count = 0, back = 0, front = 0, currZeroCount = 0;
        while(front != A.size()) {
            if (currZeroCount < B || A.get(front) == 1) {
                if (A.get(front) == 0) {
                    currZeroCount++;
                }
                count++;
                front++;
            } else {
                maxOnes = Math.max(maxOnes, count);
                if (A.get(back) == 0)
                    currZeroCount--;
                back++;
                count--;
            }
        }
        return Math.max(maxOnes, count);
    }

    /*public int solution(ArrayList<Integer> A, int B) {

        ArrayList<Integer> placesOf0s = new ArrayList<>();

        for(int i = 0; i < A.size() ; i++){
            if(A.get(i) == 0) {
                placesOf0s.add(i);
            }
        }

        if(B == 0) {
            return  most0s(A);
        }

        if(B >= placesOf0s.size()) {
            return A.size();
        }

        int most = 0;
        int currentMost = 0;
        for(int i= 0 ; i <= placesOf0s.size() - B; i++) {
            currentMost = 0;
            ArrayList<Integer> currentClone = (ArrayList) A.clone();
            for(int j = i; j< i+ B ; j++) {
                currentClone.set(placesOf0s.get(j),1);
            }
            currentMost = most0s(currentClone);
            //System.out.println("But Returning:" + currentMost);
            if(currentMost > most) {
                most = currentMost;
                currentMost = 0;
            }
        }
        return currentMost > most ? currentMost : most;
    }*/

    /*public int solution(ArrayList<Integer> A, int B) {

        ArrayList<Integer> placesOf0s = new ArrayList<>();

        int most = 0;
        int currentMost = 0;
        ArrayList<Integer> currentPlaces = new ArrayList<>();
        for(int i = 0; i < A.size() ; i++){
            if(A.get(i) == 1) {
                ++currentMost;
            } else if(B > 0 && A.get(i) == 0) {
                --B;
                currentPlaces.add(i);
                ++currentMost;
            } else if(A.get(i) == 0 && B == 0) {
                if(currentMost > most) {
                    most = currentMost;
                }
                 int removed = currentPlaces.remove(0);
                if(i - removed > most) {
                    most = i - removed;
                    currentMost = 0;
                }
                currentPlaces.add(i);
            }
        }
        return currentMost > most ? currentMost : most;
    }*/

    public int most0s(ArrayList<Integer> currentArray) {
        int currentMost = 0;
        int most = 0;
        for(int eachElement : currentArray){
            if(eachElement == 1) {
                ++currentMost;
            } else if(currentMost > most) {
                most = currentMost;
                currentMost = 0;
            } else {
                currentMost = 0;
            }
        }
        //System.out.println("==> "+ currentArray.toString() + " =====> Most:" + most + " currentMost:"+ currentMost);
        return currentMost > most ? currentMost : most;
    }
}
