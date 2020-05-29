package com.murali.problems.arrays;

public class CountArrayRotations {
  public static void main(String[] args) {
    int arr[] = {15, 18, 2, 3, 6, 12};
    int n = arr.length;
    int low = 0; int high = n - 1;
    System.out.println(binarySearch(arr, low, high));
  }

  private static int binarySearch(int[] arr, int low, int high) {
    if(high < low)
      return 0;
    if(high == low)
      return low;
    int mid = low + (high - low) / 2;
    if(mid < high && arr[mid] > arr[mid + 1])
      return mid + 1;
    if(mid > low && arr[mid] < arr[mid - 1])
      return mid;
    if(arr[high] > arr[mid])
      return binarySearch(arr, low, mid -1);
    return binarySearch(arr, mid + 1, high);

  }
}
