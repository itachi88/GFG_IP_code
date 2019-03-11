package gfg_int_prep_arr;

import java.util.Arrays;
import java.util.Scanner;

class Operating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[10000];
			Arrays.fill(a, -1);
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int yi = sc.nextInt();
			int z = sc.nextInt();
			GfG_operating g = new GfG_operating();
			boolean b = g.searchEle(a, x);
			if (b == true)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			b = g.insertEle(a, y, yi);
			if (b) {
				if (a[yi] == y)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			} else
				System.out.print("0 ");
			b = g.deleteEle(a, z);
			if (b) {
				if (!g.searchEle(a, z))
					System.out.println("1 ");
				else
					System.out.println("0 ");
			} else
				System.out.println("0 ");
		}
	}
}

/*
 * Please note that it's Function problem i.e. you need to write your solution
 * in the form of Function(s) only. Driver Code to call/invoke your function is
 * mentioned above.
 */

/* Complete the function(s) below */
class GfG_operating {
	public boolean searchEle(int a[], int x) {
		// add code here.
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean insertEle(int a[], int y, int yi) {
		// add code here.

		boolean flag = false;
		int i = 0;
		for (; i <= 100; i++) {
			if (a[i] == -1)
				break;
		}
		if (yi <= i) {
			for (int j = i; j > yi; --j) {
				a[j] = a[j - 1];
			}
			a[yi] = y;
			flag = true;
		}

		return flag;
	}

	public boolean deleteEle(int a[], int z) {
		// add code here.
        //if the element is not found in the array
        //then assume that it's deleted already
        //so delete will always be true
        //but we have to delete the element if present
		
		if (searchEle(a, z)) {
			for (int i = 0; i < a.length; ++i) {
				if (a[i] == z)
					a[i] = -1;
			}
			
		}
		return true;
	}
}