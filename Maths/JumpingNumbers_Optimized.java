package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

public class JumpingNumbers_Optimized {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			Integer n = Integer.parseInt(br.readLine());
			jumpingNumbers(n);
			System.out.println();
		}
	}

	private static void jumpingNumbers(Integer n) {

		LinkedList<Integer> ls = new LinkedList<>();
		System.out.print("0 ");
		for (int i = 1; i <= 9; i++)
			ls.add(i);

		while (!ls.isEmpty()) {
			Integer i = ls.remove();
			if(i > n) break;
			int lsb = i % 10;
			System.out.print(i+" ");
			if (lsb > 0)
				ls.add(i * 10 + (lsb - 1));
			if (lsb < 9)
				ls.add(i * 10 + (lsb + 1));
		}

	}
}
