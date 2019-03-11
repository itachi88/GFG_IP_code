package gfg_int_prep_arr;

import java.util.*;

class MaxSumPath {
	// Driver Code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int ar1[] = new int[m];
			int ar2[] = new int[n];
			for (int i = 0; i < m; i++)
				ar1[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				ar2[i] = sc.nextInt();

			GfG_MaxPath g = new GfG_MaxPath();
			System.out.println(g.maxPathSum(ar1, ar2));
			T--;
		}
	}
}

/*
 * Please note that it's Function problem i.e. you need to write your solution
 * in the form of Function(s) only. Driver Code to call/invoke your function is
 * mentioned above.
 */

class GfG_MaxPath {
	int maxPathSum(int ar1[], int ar2[]) {
		// keep summing until the common elements .. and add to max whichever is
		// greater;
		// repeat this until no common elements found
		int n1 = ar1.length, n2 = ar2.length;
		int a1[] = new int[n1 + 1];
		int a2[] = new int[n2 + 1];
		int maxSum = 0;

		a1[n1] = Integer.MAX_VALUE;
		a2[n2] = Integer.MAX_VALUE;

		for (int i = 0; i < n1; i++)
			a1[i] = ar1[i];

		for (int i = 0; i < n2; i++)
			a2[i] = ar2[i];

		n1 = a1.length;
		n2 = a2.length;

		int i = 0, j = 0;

		int max1 = 0, max2 = 0;
		while (i < n1 || j < n2) {
			if (a1[i] < a2[j]) {
				max1 += a1[i++];
			}

			else if (a1[i] > a2[j]) {
				max2 += a2[j++];
			}

			else {

				maxSum += Math.max(max1, max2) + a1[i++];
				j++;
				max1 = 0;
				max2 = 0;
			}
		}

		return maxSum - Integer.MAX_VALUE;

	}

//	int arrSum(int[] a) {
//		int sum = 0;
//		for (int i = 0; i < a.length - 1; i++)
//			sum += a[i];
//		return sum;
//	}

}