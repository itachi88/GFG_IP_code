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
import java.util.HashMap;

public class Anagram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");

			String s1 = strs[0];
			String s2 = strs[1];

			isAnagram(s1, s2);

		}
	}

	static void isAnagram(String s1, String s2) {
		boolean flag = true;
		int n1 = s1.length();
		int n2 = s2.length();

		if (n1 != n2)
			flag = false;

		else {
			HashMap<Character, Integer> m1 = new HashMap<>();
			HashMap<Character, Integer> m2 = new HashMap<>();
			char c;
			int val;
			for (int i = 0; i < n1; ++i) {
				c = s1.charAt(i);
				if (!m1.containsKey(c))
					m1.put(c, 1);

				else {
					val = m1.get(c);
					m1.put(c, ++val);
				}
			}

			for (int i = 0; i < n2; ++i) {
				c = s2.charAt(i);
				if (!m2.containsKey(c))
					m2.put(c, 1);

				else {
					val = m2.get(c);
					m2.put(c, ++val);
				}
			}

			boolean proceed = true;
			for (Character c1 : m2.keySet()) {
				if (!m1.containsKey(c1) || !(m1.get(c1) == m2.get(c1))) {
					flag = false;
					proceed = false;
					break;
				}
			}

			if (proceed) {
				for (Character c1 : m1.keySet()) {
					if (!m2.containsKey(c1) || !(m2.get(c1) == m1.get(c1))) {
						flag = false;
						break;
					}
				}
			}
		}

		System.out.println(flag ? "YES" : "NO");
	}
}
