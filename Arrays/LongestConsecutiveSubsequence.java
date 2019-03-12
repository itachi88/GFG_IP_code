package gfg_int_prep_arr;

//Java code to find Longest Consecutive Subsequence
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class LongestConsecutiveSubsequence {
	// Driver Code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			// Making object of GfG
			GfG_LCS g = new GfG_LCS();

			System.out.println(g.findLongestConseqSubseq(a, n));

			t--;
		}
	}
}

/*
 * Please note that it's Function problem i.e. you need to write your solution
 * in the form of Function(s) only. Driver Code to call/invoke your function is
 * mentioned above.
 */

class GfG_LCS {
	// Function to find Longest Consecutive Subsequence
	int findLongestConseqSubseq(int a[], int n) {
		Arrays.sort(a);
		
		for(int x : a) System.out.print(x+" ");
		int length = 1;
		int longest = 1;

		for (int i = 1; i < n; i++) {
			if (a[i] - a[i - 1] == 1)
				length++;

			else if (a[i] == a[i - 1])
				continue;
			else {
				longest = Math.max(length, longest);
				length = 1;
			}
		}
		System.out.println();
		return Math.max(longest, length);

	}
}
