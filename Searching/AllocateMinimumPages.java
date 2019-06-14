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

public class AllocateMinimumPages {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    int n = Integer.parseInt(br.readLine());
	    String str = br.readLine();
	    String[] strs = str.trim().split("\\s+");
	    int[] a = new int[n];
	    for (int i = 0; i < n; ++i)
		a[i] = Integer.parseInt(strs[i]);

	    int m = Integer.parseInt(br.readLine());

	    System.out.println(findPages(a, n, m));

	}
    }

    static long findPages(int[] a, int n, int m) {
	long sum = 0;

	if (n < m)
	    return -1;

	for (int i = 0; i < n; ++i)
	    sum += a[i];

	long start = 0, end = sum, res = Long.MAX_VALUE, mid;

	while (start <= end) {
	    mid = (start + end) / 2;

	    if (isPossible(a, n, m, mid)) {
		res = Math.min(res, mid);
		end = mid - 1;
	    } else
		start = mid + 1;
	}
	return res;
    }

    static boolean isPossible(int[] a, int n, int m, long curr_min) {
	int partition = 1;
	int curr_sum = 0;

	for (int i = 0; i < n; ++i) {
	    if (a[i] > curr_min)
		return false;

	    if (curr_sum + a[i] > curr_min) {
		partition++;
		curr_sum = a[i];

		if (partition > m)
		    return false;
	    }

	    else
		curr_sum += a[i];
	}

	return true;
    }
}
