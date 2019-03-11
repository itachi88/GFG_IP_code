package gfg_int_prep_arr;

//Using Moore's voting approach

import java.util.*;
import java.lang.*;
import java.io.*;

public class MajorityElement_opt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(major(arr, n));
		}
	}

	public static int major(int[] a, int n) {
		// Phase -1 --> nominate candidates for majority

		int maj = a[0];
		int cnt = 1;

		for (int i = 1; i < n; i++) {
			if (a[i] == maj)
				cnt++;
			else {
				cnt--;
				if (cnt == 0) {
					maj = a[i];
					cnt = 1;
				}
			}
		}

		// Phase -2 --> check frequency > n/2
		cnt = 0;
		for (int i = 0; i < n; i++)
			if (a[i] == maj)
				cnt++;

		if (cnt > n / 2)
			return maj;
		else
			return -1;
	}

}
