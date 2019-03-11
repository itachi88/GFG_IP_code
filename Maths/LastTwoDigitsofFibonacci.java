package gfg_int_prep_maths;

//LastTwoDigitsofFibonacci {

import java.util.*;
import java.lang.*;
import java.io.*;

class LastTwoDigitsofFibonacci {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			List<Integer> ls = new ArrayList<>();
			ls.add(1);
			ls.add(1);
			ls.add(2);

			int repeatLength = 0;
			int i = 3;
			while (true) {
				int prev = ls.get(i - 1);
				int prev_2 = ls.get(i - 2);
				if (prev % 100 == 1 && prev_2 % 100 == 1) {
					break;
				} else {
					repeatLength++;
					i++;
					ls.add((prev + prev_2) % 100);
				}
			}
			repeatLength++;
			// System.out.println("Repeat -->" + repeatLength);
			// System.out.println(ls);

			System.out.println(ls.get((n - 1) % repeatLength));

		}

	}
}
