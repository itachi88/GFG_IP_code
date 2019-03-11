package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class TriangularNumber {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//This approach was naive as I computed n*n+1/2 at every step
		//which is not required. I could have saved the previous value
		//of n*n+1/2 and used it in future iterations.
		
		//Another approach is solving for integral roots 
		//for the quadratic equation n*(n+1) = 2k where k is 
		//the given number to be checked triangular or not.
		while (t-- > 0) {
			long n = sc.nextLong();
			int flag = 0;
			for (long i = 1; i <= n / 2; i++) {
				if ((i * (i + 1)) / 2 == n) {
					flag = 1;
					break;
				}
			}

			System.out.println(flag);
		}
	}
}
