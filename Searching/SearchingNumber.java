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

public class SearchingNumber {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String s = br.readLine().trim();
	    String[] ss = s.trim().split("\\s+");
	    int n = Integer.parseInt(ss[0]);
	    int x = Integer.parseInt(ss[1]);
	    String str = br.readLine().trim();
	    String[] strs = str.trim().split("\\s+");
	    int[] a = new int[n];
	    for (int i = 0; i < n; ++i)
		a[i] = Integer.parseInt(strs[i]);

	    int pos = -1;
	    for (int i = 0; i < n; ++i) {
		if (a[i] == x) {
		    pos = i;
		    break;
		}
	    }

	    System.out.println(pos==-1? -1 : pos+1);
	}
    }
}
