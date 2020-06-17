package com.murali.problems.arrays;

//find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
public class LargestSumContiguousSubArray {
  public static void main(String[] args) {
    int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
    System.out.println("Maximum contiguous sum is " +
          maxSubArraySum(a));
  }

  private static int maxSubArraySum(int[] a) {
    int max_sum_so_far = 0, max_ending_here = 0;
    int size = a.length;
    for (int i = 0; i < size; i++) {
      max_ending_here = max_ending_here + a[i];
      if (max_sum_so_far < max_ending_here) {
        max_sum_so_far = max_ending_here;
      }
      if (max_ending_here < 0)
        max_ending_here = 0;
      System.out.println(max_sum_so_far + ":" + i);
    }
    return max_sum_so_far;
  }
}
