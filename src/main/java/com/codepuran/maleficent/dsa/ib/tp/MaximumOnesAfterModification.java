package com.codepuran.maleficent.dsa.ib.tp;

import java.util.ArrayList;

public class MaximumOnesAfterModification {

    public int solution(ArrayList<Integer> A, int B) {

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
    }

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
