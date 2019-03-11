package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class SquaresInMatrix {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			long result = 0l;
			while (m > 0 && n > 0) {
				result += m-- * n--; // can be formulated and generalised since it's a fixed pattern
			}

			System.out.println(result);

		}
	}
}