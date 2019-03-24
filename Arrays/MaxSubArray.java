package gfg_int_prep_arr;

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			maxSubArray(a, n);
			System.out.print("\n");
		}
	}

	static void maxSubArray(int[] a, int n) {

		int start = 0, mark = 0, length = 0, runLength = 0, sum = 0, runSum = 0;

		// got the first none negative number to start with

		for (int i = 0; i < n; ++i) {
			if (a[i] >= 0) {
				start = mark = i;
				break;
			}
		}

		for (int i = start; i < n; ++i) {
			if (a[i] >= 0) {

				runSum += a[i];
				runLength++;
			}

			else if (i < n - 1 && a[i + 1] >= 0) {
				// calc sum and length

				if (sum < runSum) {
					sum = runSum;
					length = runLength;
					mark = start;

				}

				else if (sum == runSum) {
					if (length < runLength) {
						mark = start;
						length = runLength;
					}
				}

				// reset runSum and runLength
				runSum = runLength = 0;
				start = i + 1;
			}

		}

		if (sum < runSum) {
			sum = runSum;
			length = runLength;
			mark = start;
		}

		else if (sum == runSum) {
			if (length < runLength) {
				mark = start;
				length = runLength;
			}
		}

		for (int i = mark; i < mark + length; ++i)
			System.out.print(a[i] + " ");
	}
}
