/*
* Templates 
---------------
> bufstr --> BufferedReader for array input
> pint --> Integer.parseInt
> buf --> BufferedReader declaration 
> mio --> main throws IoException
*/
package gfg_int_prep_searching;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CommonElementsThreeArrays_Map {
    public static void main(String[] args) throws IOException {

	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t-- > 0) {

	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    int n3 = sc.nextInt();

	    Set<Long> s1 = new TreeSet<>();
	    Set<Long> s2 = new TreeSet<>();
	    Set<Long> s3 = new TreeSet<>();

	    for (int i = 0; i < n1; ++i) {
//		a[i] = sc.nextLong();
		s1.add(sc.nextLong());
	    }

	    for (int i = 0; i < n2; ++i) {
//		b[i] = sc.nextLong();
		s2.add(sc.nextLong());
	    }

	    for (int i = 0; i < n3; ++i) {
//		c[i] = sc.nextLong();
		s3.add(sc.nextLong());
	    }

	    Iterator<Long> it = s1.iterator();

	    long x;
	    StringBuilder sb = new StringBuilder();
	    long prev = 0;
	    while (it.hasNext()) {
		x = it.next();
		if (s2.contains(x) && s3.contains(x) && x != prev) {
		    prev = x;
		    sb.append(prev+" ");
		}

	    }
	    System.out.println(sb.length() > 0 ? sb : -1);
	}
    }
}
