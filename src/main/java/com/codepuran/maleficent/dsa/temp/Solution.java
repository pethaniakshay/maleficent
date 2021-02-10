package com.codepuran.maleficent.dsa.temp;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int A [] = {0,0,1,0};
        s.longestOnes(A, 1);
    }

    public int longestOnes(int[] A, int K) {
        ArrayList<Integer> C = new ArrayList<>();
        for(int x : A) {
            C.add(x);
        }
        ArrayList<Integer> placesOf0s = new ArrayList<>();

        System.out.println("C: ===>" + C.toString());
        for(int i = 0; i < C.size() ; i++){
            if(C.get(i) == 0) {
                placesOf0s.add(i);
            }
        }

        if(K == 0) {
            return  most0s(C);
        }

        if(K >= placesOf0s.size()) {
            return C.size();
        }

        int most = 0;
        int currentMost = 0;
        for(int i= 0 ; i <= placesOf0s.size() - K; i++) {
            currentMost = 0;
            ArrayList<Integer> currentClone = (ArrayList) C.clone();
            for(int j = i; j< i+ K ; j++) {
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