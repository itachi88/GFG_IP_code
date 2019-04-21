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
import java.util.HashMap;
import java.util.Map;

public class AnagramPalindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			checkAnagramPalindrome(s);

		}
	}
//
//	static boolean isPalindrome(String s) {
//		boolean isPal = false;
//		int n = s.length();
//		int i = 0, j = n - 1;
//
//		while (i <= j) {
//			if (s.charAt(i++) == s.charAt(j--))
//				isPal = true;
//
//			else {
//				isPal = false;
//				break;
//			}
//
//		}
//		return isPal;
//	}

	static void checkAnagramPalindrome(String s) {

		/*
		 * TODO: iterate the map and check if all the keys have event count for an even
		 * palindrome and only one element has odd count for an odd palindrome
		 */
		int n = s.length();
		boolean flag = true;
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c))
				map.put(c, 1);

			else {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			}
		}

		// System.out.println(map);
		int cnt = 0;

		for (Integer k : map.values()) {
			if (k % 2 != 0) {
				if (cnt == 0)
					cnt += 1;
				else {
					flag = false;
					break;
				}
			}
		}

		System.out.println(flag ? "Yes" : "No");
	}
}
