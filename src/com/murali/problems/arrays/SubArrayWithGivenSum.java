package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int n = arr.length;
    int sum = 15;
    int temp = subArrayWithGivenSum(arr, n, sum);
    System.out.println(temp);
  }

  private static int subArrayWithGivenSum(int[] arr, int n, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int count = 0, sum = 0;
    map.put(0, 1);
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (map.containsKey(sum - k))
        count += map.get(sum - k);
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
}
