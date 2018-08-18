package com.murali.problems;

import java.util.*;

/**
 * @author muralinutalapati
 */
public class Staircase {

	static void staircase(int n) {
		for(int i =0;i<n;i++) {
			for(int k=n-i;k>1;k--) {
				System.out.print(" ");
			}
			for(int j=0;j <= i;j++){
				System.out.print("#");
			}
			System.out.println();
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
