package gfg_int_prep_arr;

import java.util.ArrayList;
import java.util.Scanner;

class Leaders {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			long a[] = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}

			System.out.println(leaders(a, n));
		}
	}

	public static String leaders(long[] a, int n) {

		ArrayList<Long> ls = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		long max = a[n - 1];

		for (int i = n - 1; i >= 0; i--) {
			if (a[i] >= max) {
				max = a[i];
				ls.add(a[i]);
			}
		}

		for (int i = ls.size() - 1; i >= 0; i--) {
			sb.append(ls.get(i) + " ");
		}

		return sb.toString();
	}
}