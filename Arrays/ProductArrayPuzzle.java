package gfg_int_prep_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Using Scanner caused TLE 
 * Used BufferedReader instead for 0.51 execution time*/

public class ProductArrayPuzzle {
	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long product = 1l;
			int[] a = new int[n];

			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(strs[i]);
				product *= a[i]; // I think this might be the reason for TLE
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++)
				sb.append(product / a[i] + " ");

			System.out.println(sb.toString());
		}
	}
}
