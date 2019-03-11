package gfg_int_prep_arr;

import java.util.Scanner;

class MinMaxArray {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			long inp = 0l;
			long max = 0l;
			long min = Long.MAX_VALUE;

			for (int i = 1; i <= n; i++) {
				inp = sc.nextInt();
				if (inp >= max)
					max = inp;
				if (inp <= min)
					min = inp;
			}

			System.out.println(min + " " + max);
		}
	}
}
