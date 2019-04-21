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

/*
 * Corrected a minor bug where strings like ???ab were labelled as BAD 
 * but getting accepted by the online judge.
 * */
public class GoodOrBadString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			int n = s.length();
			int cntCons = 0, cntVow = 0 ;
			boolean bad = false;
			for (int i = 0; i < n; ++i) {
				char c = s.charAt(i);
				if (isVowel(c)) {
					cntVow++;
					cntCons = 0;
					if (cntVow > 5) {
						bad = true;
						break;
					}
					

				}

				else if (!isVowel(c) && c != '?') {
					cntCons++;
					cntVow = 0;
					if (cntCons > 3) {
						bad = true;
						break;
					}
					

				} 
				
				else {
//					cntQn++;
//					if (cntVow + cntQn > 5 || cntCons + cntQn > 3) {
//						bad = true;
//						break;
//					}
					
					cntCons++;
					cntVow++;
					
					if (cntCons  > 3 || cntVow > 5) {
						bad = true;
						break;
					}
				}
			}

			if (cntCons  > 3 || cntVow > 5)
				bad = true;

			System.out.println((bad) ? 0 : 1);
		}
	}

	static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
