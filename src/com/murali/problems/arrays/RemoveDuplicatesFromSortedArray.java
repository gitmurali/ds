package com.murali.problems.arrays;

import java.util.Arrays;

// remove duplicates from sorted array and return new length
public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeDuplicates(arr, arr.length));
  }

  private static int removeDuplicates(int[] arr, int length) {
    // i slow pointer
    // j fast pointer
    int i=0;
    for (int j = 1; j < length;j++) {
      if (arr[i] != arr[j]) {
        arr[++i] = arr[j];
      }
    }
    return i+1;
  }
}
