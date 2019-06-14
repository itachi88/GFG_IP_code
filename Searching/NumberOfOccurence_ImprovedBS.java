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

public class NumberOfOccurence_ImprovedBS {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String s = br.readLine();
	    String[] ss = s.trim().split("\\s+");
	    int n = Integer.parseInt(ss[0]);
	    int x = Integer.parseInt(ss[1]);
	    String str = br.readLine();
	    String[] strs = str.trim().split("\\s+");
	    int[] a = new int[n];
	    for (int i = 0; i < n; ++i)
		a[i] = Integer.parseInt(strs[i]);

	    System.out.println(count(a, x, n));
	}
    }

    static int count(int[] a, int x, int n) {
	int i, j;

	i = first(a, 0, n - 1, x, n);

	if (i == -1)
	    return -1;
	j = last(a, i, n - 1, x, n);

	return j - i + 1;
    }

    static int first(int[] a, int lo, int hi, int x, int n) {

	int mid;
	while (lo <= hi) {
	    mid = lo + (hi - lo) / 2;

	    if ((mid == 0 || x > a[mid - 1]) && a[mid] == x)
		return mid;

	    else if (x > a[mid])
		lo = mid + 1;
	    else
		hi = mid - 1;
	}

	return -1;
    }

    static int last(int[] a, int lo, int hi, int x, int n) {
	int mid;

	while (lo <= hi) {
	    mid = lo + (hi - lo) / 2;

	    if ((mid == n - 1 || x < a[mid + 1]) && a[mid] == x)
		return mid;
	    else if (x < a[mid])
		hi = mid - 1;
	    else 
		lo = mid+1;
	}

	return -1;
    }
}
