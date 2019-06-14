/*
* Templates 
---------------
> bufstr --> BufferedReader for array input
> pint --> Integer.parseInt
> buf --> BufferedReader declaration 
> mio --> main throws IoException
*/
package gfg_int_prep_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingElementAP {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine().trim());

	while (t-- > 0) {
	    int n = Integer.parseInt(br.readLine().trim());
	    String str = br.readLine().trim();
	    String[] strs = str.trim().split("\\s+");
	    int[] a = new int[n];
	    for (int i = 0; i < n; ++i)
		a[i] = Integer.parseInt(strs[i]);

	    // common difference

	    int d = Math.min(Math.abs(a[1] - a[0]), Math.abs(a[n - 1] - a[n - 2]));
	    int f = a[0];

	    System.out.println(miss(a, 0, n - 1, d, f));

	}
    }

    static int miss(int[] a, int lo, int hi, int d, int f) {

	int mid;
	int miss = 0;
	while (lo < hi) {
	    mid = (lo + hi) / 2;

	    if (lo == hi - 1) {
		miss = a[lo] + (a[hi]-a[lo])/2;
		break;
	    }
	    // check if miss is on right or left
	    // by checking if mid is in its right place by AP nth term formula

	    if (f + mid * d == a[mid])
		lo = mid;

	    else
		hi = mid;
	}

	return miss;
    }
}
