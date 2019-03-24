package gfg_int_prep_arr;

import java.util.Scanner;

public class WaveArray_Opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; ++i)
				a[i] = sc.nextInt();

			a = waveArray(a, n);
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0 ; i < n ; ++i)
				sb.append(a[i]+" ");
			
			System.out.println(sb.toString());
				
		}
	}

	static int[] waveArray(int[] a, int n) {

		for (int i = 0; i < n; i += 2) {

			if (i > 0 && a[i - 1] >= a[i])
				swap(a, i - 1, i);

			if (i < n - 1 && a[i] < a[i + 1])
				swap(a, i, i + 1);
		}

		return a;
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
