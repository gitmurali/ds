package com.murali.ds.sorting;

/**
 * @author muralinutalapati
 */
public class ShellSort {
  private static int listToSort[] = new int[]{3, 5, 6, 8, 43, 78, 100, 10, 1, 2, 4, 7, 9};

  public static void main(String[] args) {
    print(listToSort);
    shellSort(listToSort);
  }

  private static void print(int[] listToSort) {
    for (int el : listToSort) {
      System.out.print(el + ",");
    }
    System.out.println();
  }

  private static void swap(int[] listToSort, int iIndex, int jIndex) {
    int temp = listToSort[iIndex];
    listToSort[iIndex] = listToSort[jIndex];
    listToSort[jIndex] = temp;
  }

  private static void insertionSort(int[] listToSort, int startIndex, int increment) {
    for (int i = startIndex; i < listToSort.length; i = i + increment) {
      for (int j = Math.min(i + increment, listToSort.length - 1);
           j - increment >= 0;
           j = j - increment) {
        if (listToSort[j] < listToSort[j - increment]) {
          swap(listToSort, j, j - increment);
        } else {
          break;
        }
        print(listToSort);
      }
    }
  }

  private static void shellSort(int[] listToSort) {
    int increment = listToSort.length / 2;
    while (increment >= 1) {
      for (int startIndex = 0; startIndex < increment; startIndex++) {
        insertionSort(listToSort, startIndex, increment);
      }

      increment /=  2;
    }
  }
}
