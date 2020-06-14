package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd1 {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t = scanner.nextInt();
    while (t-- > 0) {
      int k = scanner.nextInt();
      int[] arr = new int[k];
      for (int i = 0; i < k; i++) {
        arr[i] = scanner.nextInt();
      }
      int n = arr.length;
      for (int i = 0, j = 0; i < n && j < n; j++) {
        if (arr[j] != 0) {
          int temp = arr[i];
          arr[i++] = arr[j];
          arr[j] = temp;
        }
      }
      for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  }
}
