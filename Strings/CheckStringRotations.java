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
import java.util.ArrayList;
import java.util.List;

public class CheckStringRotations {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s1 = br.readLine();
			String s2 = br.readLine();

			int n1 = s1.length();
			int n2 = s2.length();

			boolean flag = false;

			if (n1 != n2)
				flag = false;

			else if (s1.equals(s2))
				flag = true;

			else {
				List<Integer> ls = new ArrayList();

				/*
				 * Iterate the 1st list and find where all the first character of 2nd list is
				 * present
				 */

				char c = s2.charAt(0);

				for (int i = 0; i < n1; ++i) {
					if (s1.charAt(i) == c)
						ls.add(i);
				}

				for (int i : ls) {
					int j = 0;
					int in = i;
					for (int k = 0; k < n1; k++) {
						if (in == n1)
							in = 0;

						char c1 = s1.charAt(in);
						char c2 = s2.charAt(j);

						if (c1 == c2) {
							in++;
							j++;
							flag = true;
						}

						else {
							flag = false;
							break;
						}
					}
					if (flag)
						break;
				}
			}
			System.out.println(flag ? 1 : 0);
		}
	}
}
