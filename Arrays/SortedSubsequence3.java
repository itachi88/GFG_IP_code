package gfg_int_prep_arr;

import java.util.*;

class SortedSubsequence3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i = 0;
			int n = sc.nextInt();
			int[] a = new int[1000];
			while (i < n) {
				a[i] = sc.nextInt();
				i++;
			}
			GfG g = new GfG();
			ArrayList aa = g.find3Numbers(a, n);
			if (aa.size() == 3) {
				int x = (int) aa.get(0);
				int y = (int) aa.get(1);
				int z = (int) aa.get(2);
				if (x < y && y < z)
					System.out.println("1");
				else
					System.out.println("0");
			} else {
				System.out.println("0");
			}
		}
	}
}

/*
 * Please note that it's Function problem i.e. you need to write your solution
 * in the form of Function(s) only. Driver Code to call/invoke your function is
 * mentioned above.
 */

/* Complete the function below */
class GfG {
	public static ArrayList find3Numbers(int[] a, int n) {
		// add code here.
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean flag = true;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (a[i] >= a[j])
					continue;
				for (int k = j + 1; k < n; k++) {
					if (a[j] >= a[k])
						continue;

					if (a[i] < a[j] && a[j] < a[k]) {
						list.add(a[i]);
						list.add(a[j]);
						list.add(a[k]);

						/*
						 * Could have returned the list here to break the loop instead of checking a
						 * boolean flag
						 */

						flag = false;
						break;
					}

				}
				if (!flag)
					break;
			}
			if (!flag)
				break;
		}

		return list;
	}
}
