package gfg_int_prep_arr;

//Optimized solution O(n)
import java.util.*;

class MinDist_opt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			Long[] a = new Long[(int) n];
			for (long i = 0; i < n; i++)
				a[(int) i] = sc.nextLong();
			long x = sc.nextLong();
			long y = sc.nextLong();
			GfG_mindist_opt g = new GfG_mindist_opt();
			System.out.println(g.minDist(a, n, x, y));
		}
	}
}

/*
 * Please note that it's Function problem i.e. you need to write your solution
 * in the form of Function(s) only. Driver Code to call/invoke your function is
 * mentioned above.
 */

/* Complete the function below */
class GfG_mindist_opt {
	long minDist(Long a[], long n, long x, long y) {
		long minDist = Integer.MAX_VALUE;
		int prev = 0;
		int i;
		for (i = 0; i < n; i++) {
			if (a[i] == x || a[i] == y) {
				prev = i++;
				break;
			}
		}

		for (; i < n; i++) {
			if (a[i] == x || a[i] == y) {
				if (a[i] != a[prev] && (i - prev) < minDist) {
					minDist = i - prev;
					prev = i;
				}

				else
					prev = i;
			}
		}

		return (minDist != Integer.MAX_VALUE) ? minDist : -1;
	}
}