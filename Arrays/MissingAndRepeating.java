package gfg_int_prep_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Optimized solution -> O(n) time O(1) space
public class MissingAndRepeating {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			
			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");

			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(strs[i]);

			findMissingAndRepeating(a, n);
		}
	}

	static void findMissingAndRepeating(int[] a, int n) {

		int index = 0;
		int miss = 0, rpt = 0;
		boolean missFound = false, rptFound = false;
		for (int i = 0; i < n; ++i) {
			index = (a[i] - 1) % n;
			a[index] += n;
		}

		for (int i = 0; i < n; ++i) {
			if ((a[i] - 1) / n > 1 && !rptFound) {
				rpt = i + 1;
				rptFound = true;
			}

			if ((a[i] - 1) < n && !missFound) {
				missFound = true;
				miss = i + 1;
			}

			if (missFound && rptFound)
				break;
		}

		System.out.println(rpt + " " + miss);
	}
}
