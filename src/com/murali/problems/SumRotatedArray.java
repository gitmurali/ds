package com.murali.problems;

public class SumRotatedArray {
  public static void main(String[] args) {
    int arr[] = {11, 15, 1, 8, 9, 10};
    int x = 16;
    System.out.println(pairInSortedRotated(arr, arr.length, x));
  }

  static boolean pairInSortedRotated(int arr[], int n, int x) {
    int i;
    for(i = 0;i<n-1;i++){
      if(arr[i] > arr[i+1]) break;
    }
    int l = (i + 1) % n;
    int r = i;
    while (l != r) {
      if(arr[l] + arr[r] == x) {
        System.out.println(arr[l]);
        System.out.println(arr[r]);
        return true;
      }
      if(arr[l] + arr[r] > x) {
        r = (n + r - 1) % n;
      } else {
        l = (l + 1) % n;
      }
    }
    return false;
  }
}
