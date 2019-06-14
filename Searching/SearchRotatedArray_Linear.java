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

public class SearchRotatedArray_Linear {
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
	    
	    int pos = -1;
	    for(int i = 0 ; i < n; ++i) {
		if(a[i] == k) {
		    pos = i ;
		    break;
		}
	    }
	    
	    System.out.println(pos);
	}
    }
}
