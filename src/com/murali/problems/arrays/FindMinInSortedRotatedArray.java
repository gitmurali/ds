package com.murali.problems.arrays;

public class FindMinInSortedRotatedArray {
  public static void main(String[] args) {
    int arr[] = {53, 61, 72, 12, 32, 43, 44};
    int n = arr.length;
    System.out.println(findMin(arr, 0, n - 1));
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
