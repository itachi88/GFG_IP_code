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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SmallestWindow {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String s1 = br.readLine();
	    String s2 = br.readLine();
	    int n1 = s1.length();
	    int n2 = s2.length();
	    HashMap<Character, Integer> m = new HashMap<>();

	    char c;
	    int val;
	    for (int i = 0; i < n2; ++i) {
		c = s2.charAt(i);
		if (!m.containsKey(c))
		    m.put(c, 1);
		else {
		    val = m.get(c);
		    m.put(c, ++val);
		}
	    }

	    HashMap<Character, Integer> tmp = new HashMap<>();
	    tmp.putAll(m);

	    int resLen = 1001, runLen = 0;
	    int in = 0;
	    List<Character> used = new ArrayList<>();
	    for (int i = 0; i < n1; ++i) {
		for (int j = i; j < n1; ++j) {
		    c = s1.charAt(j);

		    if (m.containsKey(c)) {
			val = m.get(c);

			if (val - 1 == 0) {
			    used.add(c);
			    m.put(c, 0);
			} else if (val - 1 > 0) {
			    used.add(c);
			    m.put(c, val - 1);
			}
		    }
		    runLen++;

		    if (used.size() == n2)
			break;
		}

		if (used.size() == n2) {
		    if (runLen < resLen) {
			resLen = runLen;
			in = i;
		    }

		    used.clear();
		    m.putAll(tmp);
		    runLen = 0;
		}

		else
		    break;
	    }

	    StringBuilder sb = new StringBuilder();
	    if (resLen != 1001) {
		for (int i = in; i < in + resLen; ++i) {
		    sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	    }

	    else
		System.out.println(-1);

	}
    }
}
