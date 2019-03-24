package gfg_int_prep_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainWater {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];

			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");

			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(strs[i]);

			System.out.println(trappedWater(a, n));
		}
	}

	static int trappedWater(int[] a, int n) {
		int water = 0;

		int[] l = new int[n];
		int[] r = new int[n];

		l[0] = a[0];

		for (int i = 1; i < n; i++)
			l[i] = Math.max(l[i - 1], a[i]);

		r[n - 1] = a[n - 1];

		for (int i = n - 2; i >= 0; i--)
			r[i] = Math.max(r[i + 1], a[i]);

		for (int i = 0; i < n; i++)
			water += Math.min(l[i], r[i]) - a[i];

		return water;
	}
}
