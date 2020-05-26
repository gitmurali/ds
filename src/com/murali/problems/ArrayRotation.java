package com.murali.problems;

import java.util.*;
import java.lang.*;

public class ArrayRotation {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int number = Integer.parseInt(scanner.nextLine());
    for(int i =0; i<number; i++) {
      int noOfRotations = Integer.parseInt(scanner.nextLine().split(" ")[1]);
      int[] tempArray = new int[number];
      String[] arrRowItems = scanner.nextLine().split(" ");
      tempArray = Arrays.stream(arrRowItems).mapToInt(Integer::parseInt).toArray();
      int[] rotatedArray = new int[tempArray.length];
      for(int j = 0; j<tempArray.length;j++) {
        if(j < noOfRotations) {
          rotatedArray[tempArray.length - noOfRotations + j] = tempArray[j];
        } else {
          rotatedArray[j - noOfRotations] = tempArray[j];
        }
      }
      System.out.println(Arrays.toString(rotatedArray).replace(", ", " ").replace("[", "").replace("]", ""));
    }

//    int[][] arr = new int[6][6];
//
//    for (int i = 0; i < 6; i++) {
//      String[] arrRowItems = scanner.nextLine().split(" ");
//      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//      for (int j = 0; j < 6; j++) {
//        int arrItem = Integer.parseInt(arrRowItems[j]);
//        arr[i][j] = arrItem;
//      }
//    }
  }
}
