package com.murali.problems.arrays;

import java.util.Arrays;

// Rearrange array
public class RearrangeArray {
  public static void main(String[] args) {
//    int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
//          11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
    int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
//    int[] arr = {5, 3, 1, 4, 2, 6};
    int n = arr.length;
    for (int i = 0; i < n;) {
      if (arr[i] >= 0 && arr[i] != i) {
        int ele = arr[arr[i]];
        arr[arr[i]] = arr[i];
        arr[i] = ele;
      } else {
        i++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
