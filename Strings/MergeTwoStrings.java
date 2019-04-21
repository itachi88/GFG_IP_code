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

public class MergeTwoStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");
			String s1 = strs[0];
			String s2 = strs[1];

			int n1 = s1.length();
			int n2 = s2.length();
			int i = 0, j = 0;
			StringBuilder sb = new StringBuilder();
			while (i < n1 || j < n2) {
				if (i < n1)
					sb.append(s1.charAt(i++));
				if (j < n2)
					sb.append(s2.charAt(j++));
			}

			System.out.println(sb.toString());
		}
	}
}
