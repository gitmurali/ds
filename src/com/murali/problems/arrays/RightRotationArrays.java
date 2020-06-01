package com.murali.problems.arrays;

import java.util.Arrays;

//Right rotations
public class RightRotationArrays {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int k = 1;
    int n = arr.length;
    rightRotate(arr, k, n);
  }
  static void rightRotate(int[] arr,int k, int n) {
    int tempArr[] = new int[n];
      for(int i = 0; i < n; i++) {
        if( i < k) {
          tempArr[i] = arr[n - k + i];
        } else {
          tempArr[i] = arr[i - k];
        }
      }
    System.out.println(Arrays.toString(tempArr));
  }
}
