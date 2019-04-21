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
import java.util.HashSet;

public class LongestDistinctCharacters {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String s = br.readLine();
	    HashSet<Character> set = new HashSet<>();
	    int n = s.length();
	    char c;
	    int length = 1, runLength = 0;
	    int j = 0;
	    for (int i = 0; i < n; ++i) {
		c = s.charAt(i);
		if (!set.contains(c)) {
		    set.add(c);
		    runLength++;
		} else {
		    length = Math.max(length, runLength);
		    runLength = 0;
		    set.clear();
		    j++;
		    i = j - 1;
		}
	    }
	    System.out.println(Math.max(length, runLength));
	}
    }
}
