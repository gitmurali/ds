package com.murali.ds.sorting;

/**
 * @author muralinutalapati
 */
public class SelectionSort {
  private static int[] arr = new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9, 44, 21, 45, 44};

  public static void main(String[] args) {
    // selection sort..
    sort(arr);
  }

  static void sort(int... arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          swap(i, j, arr);
        }
      }
      print(arr);
    }
  }

  static void swap(int i, int j, int... arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] listToSort) {
    for (int el : listToSort) {
      System.out.print(el + ",");
    }
    System.out.println();
  }
}
