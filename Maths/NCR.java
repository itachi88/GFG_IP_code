package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class NCR {
	static final long m = 1000000007;

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			long ncr = 0l;

			if (n >= r) {
				r = Math.max(r, n - r);

				long numr = mul(r + 1, n);
				long denr = mul(2, n - r);

				ncr = ((numr % m) * (iMod(denr, m) % m)) % m;
			}
			System.out.println(ncr);

		}
	}

//	static long iMod(long a, long m) {
//		a = a % m;
//		for (long x = 1; x < m; x++)
//			if ((a * x) % m == 1)
//				return x;
//		return 1;
//	}

	static long iMod(long a, long m) {
		long m0 = m;
		long y = 0, x = 1;

		if (m == 1)
			return 0;

		while (a > 1) {
			// q is quotient
			long q = a / m;

			long t = m;

			// m is remainder now, process
			// same as Euclid's algo
			m = a % m;
			a = t;
			t = y;

			// Update x and y
			y = x - q * y;
			x = t;
		}

		// Make x positive
		if (x < 0)
			x += m0;

		return x;
	}

	static long mul(int low, int high) {
		long res = 1l;

		for (int i = low; i <= high; i++) {
			res = ((res % m) * (i % m)) % m;
		}

		return res;
	}
}