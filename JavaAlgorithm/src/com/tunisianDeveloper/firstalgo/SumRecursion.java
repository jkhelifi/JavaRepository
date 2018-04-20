package com.tunisianDeveloper.firstalgo;

import java.util.Scanner;

/***
 * Recursive calculation of the sum of the first n (positive) integers. example:
 * n=4 ==> sum= 4+3+2+1+0 ( n=0 is stop condition)
 * 
 * @author djoHunter (jkhelifi)
 *
 */
public class SumRecursion {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		do {
			System.out.println("Write a positive number:");
			n = scanner.nextInt();
		} while (n < 0);
		System.out.println(" sum is " + sum(n));
	}

	/***
	 * 
	 * @param n
	 *            integer parameter
	 * @return sum of n
	 */
	static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return (n + sum(n - 1));
		}
	}
}
