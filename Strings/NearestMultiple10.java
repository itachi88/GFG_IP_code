/*
* Templates 
---------------
> bufstr --> BufferedReader for array input
> pint --> Integer.parseInt
> buf --> BufferedReader declaration 
> mio --> main throws IoException
*/
package gfg_int_prep_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestMultiple10 {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String str = br.readLine();
	    int n = str.length();
	    char[] c = str.toCharArray();
	    StringBuilder sb = new StringBuilder();
	    if (c[n - 1] >= '0' && c[n - 1] <= '5')
		c[n - 1] = '0';

	    else {
		int i = n - 2;
		c[n - 1] = '0';
		while (i >= 0 && c[i] == '9') {
		    c[i--] = '0';
		}
		if (i >= 0)
		    ++c[i];
		else
		    sb.append("1");
	    }

	    for (char d : c)
		sb.append(d);

	    System.out.println(sb);
	}
    }
}
