package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int t= scanner.nextInt();
    while(t-- > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scanner.nextInt();
      }
      int k = arr.length;
      pushZerosToEnd(arr, k);
      for (int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
      System.out.println();
    }
  }

  private static void pushZerosToEnd(int[] arr, int n) {
    int count = 0;
    for(int i=0;i<n;i++) {
      if(arr[i] != 0){
        arr[count++] = arr[i];
      }
    }
    while(count < n)
      arr[count++] = 0;
  }
}
