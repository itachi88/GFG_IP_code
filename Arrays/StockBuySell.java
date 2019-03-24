package gfg_int_prep_arr;

import java.util.Scanner;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			stockBuySell(a, n);
			System.out.print("\n");
		}
	}

	static void stockBuySell(int[] a, int n) {

		int buyDayStock = a[0];
		int start = 0;
		int end;
		boolean flag = true;
		for (int i = 1; i < n; ++i) {
			
			if (a[i] >= buyDayStock) {
				if (i == n - 1){
					System.out.print("(" + start + " " + i + ") ");
					flag = false;
				}

				buyDayStock = a[i];

			} else {
				
				end = i - 1;

				if (end != start){
					System.out.print("(" + start + " " + end + ") ");
					flag = false;
				}
				start = i;
				end = i;
				buyDayStock = a[i];

			}

		}
		
		if (flag)
			System.out.print("No Profit");

	}

}
