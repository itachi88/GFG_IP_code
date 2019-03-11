package gfg_int_prep_arr;

//rename class name to ChocolateDist after submission
import java.util.*;
import java.lang.*;
import java.io.*;

class ChocolateDist {
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
			int m = sc.nextInt();

			Arrays.sort(a);

			int start = 0;
			long minDiff = Long.MAX_VALUE;
			while (start <= n - m) {
				long diff = a[start + m - 1] - a[start];
				if (diff < minDiff)
					minDiff = diff;
				
				start++;
			}
			
			System.out.println(minDiff);
		}
	}
}