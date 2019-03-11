package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class FourPointsSquare {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		while (test-- > 0) {
			int flag = 0;
			int x[] = new int[4];
			int y[] = new int[4];
			for (int i = 0; i < 4; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			List<Double> arr = new ArrayList<>();
			arr.add(distance(x[0], y[0], x[1], y[1]));
			arr.add(distance(x[0], y[0], x[2], y[2]));
			arr.add(distance(x[0], y[0], x[3], y[3]));

			Collections.sort(arr);

			double first = arr.get(0);
			double second = arr.get(1);
			double last = arr.get(2);
			if (first != 0 && second != 0 && last != 0 && first == second
					&& Math.round(last * last) == Math.round(2 * first * first))
				flag = 1;

			System.out.println(flag);
		}
	}

	static double distance(int x1, int y1, int x2, int y2) {

		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}