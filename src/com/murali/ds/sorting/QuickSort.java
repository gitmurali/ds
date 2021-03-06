package com.murali.ds.sorting;

/**
 * @author muralinutalapati
 */
public class QuickSort {

  private static int listToSort[] = new int[]{3, 5, 6, 8, 43, 78, 100, 10, 1, 2, 4, 7, 9};
  private int counter = 0;
  public static void main(String[] args) {
    print(listToSort);
    quickSort(listToSort, 0, listToSort.length - 1);
    print(listToSort);
  }

  public static void print(int[] listToSort) {
    for (int el : listToSort) {
      System.out.print(el + ",");
    }
    System.out.println();
  }

  public static void swap(int[] listToSort, int iIndex, int jIndex) {
    int temp = listToSort[iIndex];
    listToSort[iIndex] = listToSort[jIndex];
    listToSort[jIndex] = temp;
  }

  public static void quickSort(int[] listToSort, int low, int high) {
    if (low >= high) {
      return;
    }
    int pivotIndex = partition(listToSort, low, high);
    quickSort(listToSort, low, pivotIndex - 1);
    quickSort(listToSort, pivotIndex + 1, high);
  }

  public static int partition(int[] listToSort, int low, int high) {
    int pivot = listToSort[low];
    int l = low;
    int h = high;
    while (l < h) {
      while (listToSort[l] <= pivot && l < h) {
        l++;
      }
      while (listToSort[h] > pivot) {
        h--;
      }
      if (l < h) {
        swap(listToSort, l, h);
      }
    }
    swap(listToSort, low, h);

    System.out.println("Pivot: " + pivot);
    print(listToSort);
    return h;
  }

  public int divisorSum(int n) {
    for (int i = 1; i < n; i++) {
      if(n == 1) {
        return 1;
      } else if ((n % i) == 0) {
        counter += i;
      }
    }
    return counter;
  }
}
