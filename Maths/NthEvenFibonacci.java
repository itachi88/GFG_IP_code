package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class NthEvenFibonacci {
	static List<Long> fibs = new ArrayList<>();
	static long modWith = 1000000007;

	public static void main(String[] args) throws IOException {
		// code
		genFib();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			System.out.println(fibs.get(3 * n - 1));

		}
	}

	static void genFib() {
		fibs.add(1l);
		fibs.add(1l);
		for (int i = 2; i < 5000; i++) {
			fibs.add((fibs.get(i - 1) % modWith + fibs.get(i - 2) % modWith) % modWith);
		}
	}
}