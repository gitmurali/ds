package com.murali.problems;

import java.util.Arrays;
import java.util.Scanner;

//achieve search in O(logn)
public class SearchRotatedArray {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main (String[] args) {
    int t = Integer.parseInt(scanner.nextLine());
    while(t>0) {
      int n = Integer.parseInt(scanner.nextLine());
      int[] tempArray = new int[n];
      String[] arrRowItems = scanner.nextLine().split(" ");
      tempArray = Arrays.stream(arrRowItems).mapToInt(Integer::parseInt).toArray();
      int key = Integer.parseInt(scanner.nextLine());
      int low = 0; int high = n - 1;
      int pivot = findPivot(tempArray, low, high);
      int found = findElement(pivot, tempArray, low, high, key);
      System.out.println(found);
      t--;
    }
  }

  private static int findPivot(int[] arr, int low, int high) {
          if(high < low) return -1;
          if(high == low) return low;
          int mid = (low + high)/2;
          if(mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
          } else if (mid > low && arr[mid -1] > arr[mid]) {
            return mid - 1;
          }
          if(arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
          return findPivot(arr, mid + 1, high);
  }

  private static int findElement(int pivot, int[] arr1, int low, int high, int key) {
    if(pivot == -1) return binarySearch(arr1, low, high, key);
    if(arr1[pivot] == key) return pivot;
    if(arr1[0] <= key)
      return binarySearch(arr1, 0, pivot -1, key);
    return binarySearch(arr1, pivot +1, high, key);
  }

  private static int binarySearch(int[] arr1, int low, int high, int key) {
    if(high < low) return -1;
    int mid = (low + high) / 2;
    if(key == arr1[mid]) return mid;
    if(key > arr1[mid]) return binarySearch(arr1, (mid + 1), high, key);
    return binarySearch(arr1, low, (mid - 1), key);
  }
}
