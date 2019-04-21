/*
* Templates 
---------------
> bufstr --> BufferedReader with string i/p
> pint --> Integer.parseInt
> buf --> BufferedReader declaration 
> mio --> main throws IoException
*/
package gfg_int_prep_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortDescending {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			char[] c = s.toCharArray();
			
			Arrays.sort(c);
			StringBuilder sb = new StringBuilder();
			for(int i = c.length -1 ; i >=0 ; i--)
				sb.append(c[i]);
			
			System.out.println(sb);
		}
	}
}
