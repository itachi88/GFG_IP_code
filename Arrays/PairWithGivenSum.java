package gfg_int_prep_arr;

import java.util.Scanner;

public class PairWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; ++i)
				a[i] = sc.nextInt();

			int k = sc.nextInt();
			
			pairWithSum(a, n, k);
		}
	}

	static void pairWithSum(int[] a, int n, int k) {

		int i = 0;
		int j = n - 1;
		boolean flag = false;

		if (k < a[0] + a[1] || k > a[n - 1] + a[n - 2])
			System.out.println(-1);

		else {
			while (i < j) {

				int sum = a[i] + a[j];
				if (sum < k)
					i++;

				else if (sum > k)
					j--;

				else {
					System.out.println(a[i++] + " " + a[j--] + " " + k);
					flag = true;
				}
			}

			if (!flag)
				System.out.println(-1);
		}

	}
}
