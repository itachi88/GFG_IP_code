package gfg_int_prep_arr;

//Optimized solution O(n) using auxiliary space
import java.util.*;

class SortedSubsequence3_Opt {
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
			GfG_ss3opt g = new GfG_ss3opt();
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
class GfG_ss3opt {
	public static ArrayList find3Numbers(int[] a, int n) {

		ArrayList<Integer> ls = new ArrayList<>();
		int min = 0;
		int max = n - 1;

		int[] small = new int[n];
		small[0] = -1;

		for (int i = 1; i < n; i++) {
			if (a[i] <= a[min]) {
				min = i;
				small[i] = -1;
			} else
				small[i] = min;
		}

		int[] big = new int[n];
		big[max] = -1;

		for (int i = n - 2; i >= 0; i--) {
			if (a[i] >= a[max]) {
				max = i;
				big[i] = -1;
			}

			else
				big[i] = max;
		}

		for (int i = 1; i < n - 1; i++) {
			if (small[i] != -1 && big[i] != -1) {
				ls.add(a[small[i]]);
				ls.add(a[i]);
				ls.add(a[big[i]]);
				break;
			}
		}
		return ls;
	}
}
