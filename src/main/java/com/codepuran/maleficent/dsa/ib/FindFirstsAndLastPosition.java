package com.codepuran.maleficent.dsa.ib;

public class FindFirstsAndLastPosition {

    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int result[] = new int[]{-1,-1};
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            result = runForSolution(nums,target,false,mid,result);
            if(result[0] != -1 && result[1] != -1){
                return result;
            } else if(nums[mid] > target) {

                low = mid + 1;
            } else {

                high = mid -1;
            }

        }
        return result;
    }

    public int[] runForSolution(int[] nums, int target, boolean firstMatched,int currentPosition, int result[]) {

        if(currentPosition + 1 <= nums.length - 1 && nums[currentPosition + 1] == target) {
            if (firstMatched) {
                result[1] = currentPosition + 1;
                return result;
            } else {
                result[0] = currentPosition + 1;
                return runForSolution(nums,target,true,currentPosition + 1,result);
            }
        }
        if(currentPosition - 1 >= 0 && nums[currentPosition - 1] == target) {
            if (firstMatched) {
                result[1] = currentPosition - 1;
                return result;
            } else {
                result[0] = currentPosition - 1;
                return runForSolution(nums,target,true,currentPosition - 1,result);
            }
        }
        return result;
    }
}
