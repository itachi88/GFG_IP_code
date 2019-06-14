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

public class LastIndexOfOne {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String str = br.readLine();
	    int pos = -1;
	    for (int i = 0; i < str.length(); ++i) {
		if (str.charAt(i) == '1')
		    pos = i;
	    }

	    System.out.println(pos);
	}
    }
}
