package gfg_int_prep_arr;

import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			StringBuilder sb = new StringBuilder();
			int a = sc.nextInt();
			set.add(a);
			System.out.print(a + " ");
			for (int i = 1; i < n; i++) {
				a = sc.nextInt();
				if (!set.contains(a)) {
					set.add(a);
					sb.append(a + " ");
				}
			}
			System.out.println(sb.toString());
		}

	}
}