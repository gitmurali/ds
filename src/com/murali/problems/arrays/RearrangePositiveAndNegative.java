package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangePositiveAndNegative {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t= scanner.nextInt();
    while(t > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scanner.nextInt();
      }
      int k = arr.length;
      rearrangeArray(arr, k);
      System.out.println(Arrays.toString(arr));
      t--;
    }
  }

  private static void rearrangeArray(int[] arr, int n) {
    int i = -1, temp = 0;
    for(int j = 0; j<n; j++) {
      if(arr[j] < 0){
        i++;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int pos = i + 1, neg = 0;
    while(pos < n && neg < pos && arr[neg] < 0) {
      temp = arr[neg];
      arr[neg] = arr[pos];
      arr[pos] = temp;
      pos++;
      neg += 2;
    }
  }

}
