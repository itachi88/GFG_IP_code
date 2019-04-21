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

public class ReverseWordsInString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			String[] str = s.trim().split("\\.");
			int n = str.length;
			StringBuilder sb = new StringBuilder();
			for (int i = n - 1; i >= 0; --i) {
				sb.append(str[i]);
				if (i != 0)
					sb.append(".");
			}

			System.out.println(sb);
		}
	}
}
