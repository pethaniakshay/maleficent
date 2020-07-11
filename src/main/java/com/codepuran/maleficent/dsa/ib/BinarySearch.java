package com.codepuran.maleficent.dsa.ib;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = new int[] {10,15,20,25,30,40,50,55,60,65,70,75,80,85,90,95};
        System.out.println("Solution: " + solution(95,sortedArray) );
    }

    private static int solution(int element, int[] sortedArray) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
         int mid = (low + high) / 2;
         if(sortedArray[mid] == element) {
             return mid;
         } else if(element > sortedArray[mid] ) {
             low = mid + 1;
         } else if(element < sortedArray[mid]) {
             high = mid -1;
         }
        }
        return -1;
    }
}
