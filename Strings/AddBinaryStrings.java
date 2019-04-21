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

public class AddBinaryStrings {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    String str = br.readLine();
	    String[] strs = str.trim().split("\\s+");
	    String s1 = strs[0];
	    String s2 = strs[1];

	    addBinaryStrings(s1, s2);
	}
    }

    static void addBinaryStrings(String s1, String s2) {
	int n1 = s1.length();
	int n2 = s2.length();
	String lng, sht;
	if (n1 >= n2) {
	    lng = s1;
	    sht = s2;
	} else {
	    lng = s2;
	    sht = s1;
	}

	n1 = lng.length();
	n2 = sht.length();
	int i = n1 - 1;
	int j = n2 - 1;

	int sum = 0, carry = 0;

	int[] res = new int[n1 + 1];
	while (i >= 0) {
	    // bit addition rules

	    if (j >= 0)
		sum = lng.charAt(i) - '0' + sht.charAt(j) - '0' + carry;
	    else
		sum = lng.charAt(i) - '0' + carry;
	    if (sum == 1) {
		res[i + 1] = 1;
		carry = 0;
	    } else if (sum == 2) {
		res[i + 1] = 0;
		carry = 1;
	    } else if (sum == 3) {
		res[i + 1] = 1;
		carry = 1;
	    } else {
		res[i + 1] = 0;
		carry = 0;
	    }

	    i--;
	    j--;
	}

	res[0] = carry;

	StringBuilder sb = new StringBuilder();

	for (int z : res)
	    sb.append(z);

	System.out.println((sb.charAt(0) == '0') ? sb.substring(1) : sb);
    }
}
