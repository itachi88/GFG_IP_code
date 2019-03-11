package gfg_int_prep_arr;

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayRotation {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int d = sc.nextInt(); // no of times to be rotated

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			printRotatedArray(arr, d);
			System.out.println();
		}
	}

	static void printRotatedArray(int[] a, int d) {
		int n = a.length;
		int j = d;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; ++i , j= (j+1)%n) {
// 			System.out.print(a[j] + " ");
            sb.append(a[j] + " ");
		}
		System.out.print(sb.toString());
	}
}