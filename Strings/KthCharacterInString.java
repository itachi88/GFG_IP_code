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

public class KthCharacterInString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");
			int m = Integer.parseInt(strs[0]);
			int k = Integer.parseInt(strs[1]);
			int n = Integer.parseInt(strs[2]);

			String s = binToDec(m);
			StringBuilder temp = new StringBuilder();
			for(int i = 0 ; i < n ; ++i) {
				for(int j = 0 ; j < s.length() ; ++j) {
					if(s.charAt(j) == '1')
						temp.append("10");
					else
						temp.append("01");
				}
				
				s = temp.toString();
				temp = new StringBuilder();
			}
			
			System.out.println(s.charAt(k));
		}
	}

	static String binToDec(int m) {
		StringBuilder sb = new StringBuilder();
		while (m > 0) {
			sb.append(m % 2);
			m /= 2;
		}

		return sb.reverse().toString();
	}
}
