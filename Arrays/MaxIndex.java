package gfg_int_prep_arr;

import java.io.IOException;
import java.util.Scanner;

// Optimized solution -> O(n) time - double array technique
public class MaxIndex {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine());
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			// int n = Integer.parseInt(br.readLine());
			int n = sc.nextInt();
			int[] a = new int[n];

//			String str = br.readLine();
//			String[] strs = str.trim().split("\\s+");

			for (int i = 0; i < n; ++i)
				// a[i] = Integer.parseInt(strs[i]);
				a[i] = sc.nextInt();

			int res = findMaxIndex(a, n);

			System.out.println(res);
		}
	}

	static int findMaxIndex(int[] a, int n) {
		int max = 0;

		int[] l = new int[n];
		int[] r = new int[n];

		l[0] = a[0];
		r[n - 1] = a[n - 1];

		for (int i = 1; i < n; ++i)
			l[i] = min(a[i], l[i - 1]);

		for (int i = n - 2; i >= 0; --i)
			r[i] = max(a[i], r[i + 1]);

		int i = 0, j = 0; // 2 pointers for the l and r arrays respectively

		while (j < n && i < n) {
			if (l[i] <= r[j]) {
				max = max(max, j - i);
				j++;
			} else
				i++;
		}

		return max;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

}
