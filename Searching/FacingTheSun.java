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

public class FacingTheSun {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    int n = Integer.parseInt(br.readLine());
	    String str = br.readLine();
	    String[] strs = str.trim().split("\\s+");
	    int[] h = new int[n];
	    for (int i = 0; i < n; ++i)
		h[i] = Integer.parseInt(strs[i]);
	    
	    int cnt = 1;
	    int max = h[0];
	    
	    for(int i = 1 ; i < n ; ++i) {
		if(h[i] > max) {
		    cnt++;
		    max = h[i];
		}
	    }
	    
	    System.out.println(cnt);
	}
    }
}
