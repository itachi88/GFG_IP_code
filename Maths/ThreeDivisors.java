package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class ThreeDivisors {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			Integer n = sc.nextInt();
			Integer count = 0;
			for (Integer i = 1; i * i <= n; i++) {
				if (isPrime(i)) {
					//System.out.println("Prime = " + i);
					count++;
				}
			}

			System.out.println(count);
		}
	}

	public static boolean isPrime(Integer n) {
		boolean flag = true;

		if (n == 1)
			flag = false;
		for (Integer i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}