package com.murali.problems.arrays;

import java.util.Arrays;

//reverse array
public class ReverseArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 9, 10, 11,15};
    int n = arr.length;
    revereseArray(arr, 0, n - 1);
    System.out.println(Arrays.toString(arr));
  }

  private static void revereseArray(int[] arr, int start, int end) {
    if(start >= end)
      return;
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    revereseArray(arr, start + 1, end -1);
  }
}
