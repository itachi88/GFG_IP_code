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

public class SearchRotatedArray_binarySearch {
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

	    int k = Integer.parseInt(br.readLine());

	    System.out.println(search(a, 0, n - 1, k));

	}
    }

    static int search(int[] a, int lo, int hi, int k) {

	if (hi < lo)
	    return -1;

	int mid = lo + (hi - lo) / 2;

	if (a[mid] == k)
	    return mid;

	if (a[lo] <= a[mid]) {
	    if (k >= a[lo] && k <= a[mid])
		return search(a, lo, mid - 1, k);

	    return search(a, mid + 1, hi, k);
	}

	if (k >= a[mid] && k <= a[hi])
	    return search(a, mid + 1, hi, k);

	return search(a, lo, mid - 1, k);
    }
}
