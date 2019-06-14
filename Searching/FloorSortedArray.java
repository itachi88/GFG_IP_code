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

public class FloorSortedArray {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String ss = br.readLine();
	    String[] sss = ss.trim().split("\\s+");

	    int n = Integer.parseInt(sss[0]);
	    int x = Integer.parseInt(sss[1]);
	    String str = br.readLine();
	    String[] strs = str.trim().split("\\s+");
	    long[] a = new long[n];
	    for (int i = 0; i < n; ++i)
		a[i] = Long.parseLong(strs[i]);

	    System.out.println(floorSorted(a, 0, n - 1, x, n));

	}
    }

    static int floorSorted(long[] a, int lo, int hi, int x, int n) {
	int pos = -1;
	int mid;
	while (lo <= hi) {
	    mid = lo + (hi - lo) / 2;

	    if (a[mid] == x)
		return mid;

	    else if (lo == hi - 1) {
		if (a[hi] <= x)
		    return hi;
		if (a[lo] <= x)
		    return lo;
	    }

	    if (a[mid] < x)
		lo = mid;

	    else
		hi = mid - 1;
	}

	return pos;
    }
}
