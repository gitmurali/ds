package com.murali.problems;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author muralinutalapati
 * @link https://www.hackerrank.com/challenges/2d-array/problem
 */
public class HourGlass {
	/*
			input 6x6 matrix
			1 1 1 0 0 0
			0 1 0 0 0 0
			1 1 1 0 0 0
			0 0 2 4 4 0
			0 0 0 2 0 0
			0 0 1 2 4 0
*/

	static int hourglassSum(int[][] arr) {
		int hourGlassSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[i].length - 2; j++) {
				int sum = 0;
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				sum += arr[i + 1][j + 1];
				sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (sum > hourGlassSum) {
					hourGlassSum = sum;
				}
			}
		}
		return hourGlassSum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);
		System.out.println(result);
		scanner.close();
	}
}
