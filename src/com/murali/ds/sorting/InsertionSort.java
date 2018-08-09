package com.murali.ds.sorting;

/**
 * @author muralinutalapati
 */
public class InsertionSort {

  private static int list[] = new int[]{3, 5, 6, 8, 43, 78, 100, 10, 1, 2, 4, 7, 9};

  public static void main(String[] args) {
//    insertion sort
    print(list);
    insertionSort(list);
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

  public static void insertionSort(int[] listToSort) {
    for (int i = 0; i < listToSort.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (listToSort[j] < listToSort[j - 1]) {
          swap(listToSort, j, j - 1);
        } else {
          break;
        }
      }
      print(listToSort);
    }
  }
}
