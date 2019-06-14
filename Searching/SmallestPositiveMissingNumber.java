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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestPositiveMissingNumber {
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

	    // System.out.println(small_hash(a,n));
	    System.out.println(smallestMissing(a, n));

	}
    }

    static int small_hash(int[] a, int n) {
	Set<Integer> s = new HashSet<>();
	int var = 1;

	for (int x : a)
	    if (x > 0)
		s.add(x);

	for (int x : s) {
	    if (!s.contains(var))
		return var;
	    var++;
	}

	return var;
    }

    static int smallestMissing(int[] a, int n) {
	int j = 0, temp, index;

	for (int i = 0; i < n; ++i) {
	    if (a[i] <= 0) {
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		j++;
	    }
	}

	index = j;
	int[] a2 = new int[n - j];
	int k = 0;
	for (int i = j; i < n; ++i, ++k)
	    a2[k] = a[i];

	int x;
	for (int i = 0; i < a2.length; ++i) {
	    x = Math.abs(a2[i]);
	    if ((x - 1) < a2.length && a2[x - 1] > 0)
		a2[x - 1] = -a2[x - 1];
	}

	for (int i = 0; i < a2.length; ++i) {
	    if (a2[i] > 0)
		return i + 1;
	}

	return n + 1;
    }
}
