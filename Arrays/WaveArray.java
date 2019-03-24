package gfg_int_prep_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Strange thing it got TLE with BufferedReader but passed with Scanner.
 * I think it's maybe because of the constant parsing of strings to Integers.*/

public class WaveArray {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine());

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
//		
		while (t-- > 0) {
//			int n = Integer.parseInt(br.readLine());
			int n = sc.nextInt();
			int[] a = new int[n];
//			String str = br.readLine();
//			String[] strs = str.trim().split("\\s+");
//			

			for (int i = 0; i < n; ++i)
//				a[i] = Integer.parseInt(strs[i]);
				a[i] = sc.nextInt();

			if (n % 2 == 0)
				wavePrint(a, n);

			else {
				wavePrint(a, n - 1);
				System.out.print(a[n - 1]);
			}

			System.out.println();
		}

	}

	public static void wavePrint(int[] a, int end) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < end; i += 2)
			sb.append(a[i] + " " + a[i - 1] + " ");

		System.out.print(sb.toString());
	}
}
