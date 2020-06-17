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
    int start = 0, end = 0, s=0;
    for (int i = 0; i < size; i++) {
      max_ending_here = max_ending_here + a[i];
      if (max_sum_so_far < max_ending_here) {
        max_sum_so_far = max_ending_here;
        start=s;
        end = i;
      }
      if (max_ending_here < 0) {
        max_ending_here = 0;
        s = i + 1;
      }
    }
    System.out.println("Starting index " + start);
    System.out.println("Ending index " + end);
    return max_sum_so_far;
  }
}
