package com.codepuran.maleficent.dsa.algoexpert;

import java.util.Arrays;

public class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    array = Arrays.stream(array).sorted().toArray();
    int head = 0;
    int tail = array.length -1;

    while (head < tail) {
      int sum = array[head] + array[tail];
      if(sum == targetSum) {
        return new int[]{array[head], array[tail]};
      } else if(sum < targetSum) {
        head++;
      } else if(sum > targetSum) {
        tail--;
      }
    }
    return new int[0];
  }

  public static void main(String[] args) {

    int[] arr = Program.twoNumberSum(new int[] {5,8,9,11,12,16,19,23,26,29,35}, 42);

  }
}