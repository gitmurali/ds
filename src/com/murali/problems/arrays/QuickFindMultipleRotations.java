package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class QuickFindMultipleRotations {
  /*
  input copy or paste below input
  2
  5 14
  1 3 5 7 9
  338 9384
  78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89 85 4 52 55 100 33 61 77 69 40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65 29 42 51 94 1 35 65 25 15 88 57 44 92 28 66 60 37 33 52 38 29 76 8 75 22 59 96 30 38 36 94 19 29 44 12 29 30 77 5 44 64 14 39 7 41 5 19 29 89 70 18 18 97 25 44 71 84 91 100 73 26 45 91 6 40 55 87 70 83 43 65 98 8 56 5 49 12 23 29 100 44 47 69 41 23 12 11 6 2 62 31 79 6 21 37 45 27 23 66 9 17 83 59 25 38 63 25 1 37 53 100 80 51 69 72 74 32 82 31 34 95 61 64 100 82 100 97 60 74 14 69 91 96 27 67 85 41 91 85 77 43 37 8 46 57 80 19 88 13 49 73 60 10 37 11 43 88 7 2 14 73 22 56 20 100 22 5 40 12 41 68 6 29 28 51 85 59
   */

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t = Integer.parseInt(scanner.nextLine());
    while(t > 0) {
      String[] line = scanner.nextLine().split("\\s");
      int n = Integer.parseInt(line[0]);
      int k = Integer.parseInt(line[1]);
      String[] arrRowItems = scanner.nextLine().split("\\s");
      int[] arr;
      arr = Arrays.stream(arrRowItems).mapToInt(Integer::parseInt).toArray();
      findMultiples(arr, n, k);
      t--;
    }
  }

  private static void findMultiples(int[] arr, int n, int k) {
    StringBuilder sb = new StringBuilder();
    for(int i = k; i < k + n; i++)
      sb.append(arr[i % n]+ " ");
    System.out.println(sb.toString());
  }
}

