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

public class PeakElement {
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

	    System.out.println(peakElement(a, n));
	}
    }

    static int peakElement(int[] a, int n) {

	int peak = 0;

	if (n == 1)
	    return peak;

	else {
	    if (a[0] >= a[1])
		return 0;
	    if (a[n - 1] >= a[n - 2])
		return n - 1;
	    else {
		for (int i = 1; i < n - 1; ++i) {

		    if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
			peak = i;
			break;
		    }
		}
	    }

	}

	return peak;
    }
}
