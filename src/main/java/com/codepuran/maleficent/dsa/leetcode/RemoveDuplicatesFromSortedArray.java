package com.codepuran.maleficent.dsa.leetcode;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int len = 0;
        if(nums.length == 0) {
            return 0;
        }
        len = 1;
        int currentNumber = nums[0];
        for(int i : nums) {
            if(i != currentNumber) {
                currentNumber = i;
                nums[len-1] = currentNumber;
                ++len;
            }
        }
        return len;
    }

    public int removeDuplicates(ArrayList<Integer> nums) {
        int len = 0;
        if(nums.size() == 0) {
            return 0;
        }
        len = 1;
        int currentNumber = nums.get(0);
        for(int i : nums) {
            if(i != currentNumber) {
                currentNumber = i;
                nums.set(len-1, currentNumber);
                ++len;
            }
        }
        return len;
    }
}
