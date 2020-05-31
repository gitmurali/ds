package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class FindMinInSortedRotatedArray {
  /*
    2
    5
    4 5 1 2 3
    7
    10 20 30 40 50 5 7
   */
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t= scanner.nextInt();
    while(t > 0) {
      int n = scanner.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++) {
        a[i] = scanner.nextInt();
      }
      int min = findMin(a, 0, n - 1);
      System.out.println(min);
      t--;
    }
  }

  static int findMin(int arr[], int low, int high) {
    if(high < low) return arr[0];
    if(high == low) return arr[low];
    int mid = (low + high) / 2;
    if(mid < high && arr[mid] > arr[mid + 1]) return arr[mid + 1];
    if(mid > low && arr[mid] < arr[mid - 1]) return arr[mid];
    if(arr[high] > arr[mid])
      return findMin(arr, low, mid - 1);
    return findMin(arr, mid + 1, high);
  }
}
