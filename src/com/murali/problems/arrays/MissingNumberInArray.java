package com.murali.problems.arrays;

import java.util.Arrays;

//find missing number in array
public class MissingNumberInArray {
  public static void main(String[] args) {
    int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    int n = arr.length + 1;
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    int missingNumber = (n * (n - 1) / 2) - sum;
    System.out.println(missingNumber);
  }
}
