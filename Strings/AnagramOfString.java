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

public class AnagramOfString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			int n1 = s1.length();
			int n2 = s2.length();
			
			
			int cnt = 0 ;
			HashMap<Character, Integer> m1 = new HashMap<>();
			HashMap<Character, Integer> m2 = new HashMap<>();
			
			for(int i = 0 ; i < n1 ; ++i) {
				char c = s1.charAt(i);
				if(!m1.containsKey(c))
					m1.put(c, 1);
				
				else {
					int val = m1.get(c);
					m1.put(c, ++val);
				}
			}
			
			for(int i = 0 ; i < n2 ; ++i) {
				char c = s2.charAt(i);
				if(!m2.containsKey(c))
					m2.put(c, 1);
				
				else {
					int val = m2.get(c);
					m2.put(c, ++val);
				}
			}
			
			
			for(Character c : m1.keySet()) {
				if(!m2.containsKey(c)){
					cnt+=m1.get(c);
					m1.put(c,0);
				}
				else if(m1.get(c) != m2.get(c)) {
					int diff = Math.abs(m1.get(c) - m2.get(c));
					cnt += diff;
					m1.put(c, Math.min(m1.get(c), m2.get(c)));
					m2.put(c, Math.min(m1.get(c), m2.get(c)));
				}
			}
			
			for(Character c : m2.keySet()) {
				if(!m1.containsKey(c)){
					cnt+=m2.get(c);
					m2.put(c,0);
				}
				else if(m1.get(c) != m2.get(c)) {
					cnt += Math.abs(m1.get(c) - m2.get(c));
				}
			}
			
			System.out.println(cnt);
		}
	}
}
