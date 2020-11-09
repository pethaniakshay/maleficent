package com.codepuran.maleficent.dsa.ib;

import java.util.ArrayList;

public class MatrixSearch {

    public static void main(String[] args) {
        ArrayList<Integer> in1 = new ArrayList<>();
        in1.add(1);
        in1.add(11);
        in1.add(49);
        in1.add(74);
        in1.add(77);
        in1.add(78);
        in1.add(93);
        in1.add(94);
        //in1.add(77);
        ArrayList<ArrayList<Integer>> input = new ArrayList();
        input.add(in1);

        MatrixSearch ms = new MatrixSearch();

        System.out.println(ms.searchMatrix(input,49));
    }

    public  int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {

        int low = 0;
        int low_val = A.get(0).get(0);
        int high = A.size() - 1, high_val = A.get(A.size() - 1).get(0);

        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_val = A.get(mid).get(0);
            if(high == low ) {
                return binarySearch(B, A.get(low));
            }
            if(high - low == 1) {
                if(B >= A.get(low).get(0) && B <= A.get(low).get(A.get(low).size() -1)){
                    return binarySearch(B, A.get(low));
                } else {
                    return binarySearch(B, A.get(high));
                }
            }

            if(B == high_val || B == low_val || B == mid_val) {
                return 1;
            }
            if(B  <= low_val && B > mid_val) {
                high = low - 1;
            } else {
                low = mid;
            }

        }
        return 0;
    }
    private  int binarySearch(int element, ArrayList<Integer> sortedArray) {
        int low = 0;
        int high = sortedArray.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(sortedArray.get(mid) == element) {
                return 1;
            } else if(element > sortedArray.get(mid) ) {
                low = mid + 1;
            } else if(element < sortedArray.get(mid)) {
                high = mid -1;
            }
        }
        return 0;
    }
}
