package com.codepuran.maleficent.dsa.ib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfArray {

    public static void main(String[] args) {

        MedianOfArray md = new MedianOfArray();

        List<Integer> A = Arrays.asList(1,2,3,4);
        List<Integer> B = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Result: " + md.findMedianSortedArrays(A,B));

    }

    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        double median = 0d;
        double medianPlus = 0d;
        List<Integer> newList = new ArrayList<>();
        int aP = 0;
        int bP = 0;
        int loopLength = a.size() + b.size();
        boolean aOut = false;
        boolean bOut = false;
        for(int i = 0 ; i<  loopLength ; i ++ ){
            if(aP == a.size()){
                aOut = true;
                aP = 0;
            }
            if(bP == b.size()){
                bOut = true;
                bP = 0;
            }
            if((aOut == false && bOut == false) && a.get(aP) ==  b.get(bP)) {
                median = a.get(aP);
                medianPlus = a.get(aP);
                newList.add((int) medianPlus);
                newList.add((int) medianPlus);
                i++;
                aP++;
                bP++;
            } else if((bOut == true && aOut == false) || ( aOut == false && (a.get(aP) < b.get(bP)))) {
                median = medianPlus;
                medianPlus = a.get(aP);
                newList.add((int) medianPlus);
                aP++;
            } else if(bOut == false){
                median = medianPlus;
                medianPlus = b.get(bP);
                newList.add((int) medianPlus);
                bP++;
            }
            if(i >= (loopLength/2) ) {
                break;
            }
            if(loopLength % 2 == 0){
                if(i >= (loopLength/2) - 1) {
                    return (median + medianPlus) /2;
                }
            } else {
                if(i >= (loopLength/2) ) {
                    return medianPlus;
                }
            }
        }
        return median;
    }


}
