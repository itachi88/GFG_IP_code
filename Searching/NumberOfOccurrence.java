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

public class NumberOfOccurrence {
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

	    int cnt = 0;
	    for (int i = 0; i < n; ++i) {
		a[i] = Integer.parseInt(strs[i]);
		if (a[i] == x)
		    cnt++;
	    }

	    System.out.println(cnt == 0 ? -1 : cnt);

	}
    }
}
