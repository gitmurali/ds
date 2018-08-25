package com.murali.problems;

import java.util.stream.IntStream;

/**
 * @author muralinutalapati
 * @link https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class ArraysLeftRotation {

	/*
			smaple input->
				5 4
				1 2 3 4 5
	 */
	public static void main(String[] args) {
		int d = 4;
		int[] a = {1, 2, 3, 4, 5};
		int temp;
		for (int j = 0; j < d; j++) {
			temp = a[0];
			IntStream.range(0, a.length - 1).forEach(i -> a[i] = a[i + 1]);
			a[a.length - 1] = temp;
		}
		IntStream.range(0, a.length).forEach(i -> System.out.print(a[i] + " "));
	}
}
