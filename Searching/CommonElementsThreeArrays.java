/*
* Templates 
---------------
> bufstr --> BufferedReader for array input
> pint --> Integer.parseInt
> buf --> BufferedReader declaration 
> mio --> main throws IoException
*/
package gfg_int_prep_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CommonElementsThreeArrays {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

//	Scanner sc = new Scanner(System.in);
//	int t = sc.nextInt();
	while (t-- > 0) {
	    String size = br.readLine().trim();
	    String[] sizes = size.split("\\s+");
	    int n1 = Integer.parseInt(sizes[0]);
	    int n2 = Integer.parseInt(sizes[1]);
	    int n3 = Integer.parseInt(sizes[2]);

	    String a1 = br.readLine().trim();
	    String b1 = br.readLine().trim();
	    String c1 = br.readLine().trim();

	    String[] aa1 = a1.split("\\s+");
	    String[] bb1 = b1.split("\\s+");
	    String[] cc1 = c1.split("\\s+");

//	    int n1 = sc.nextInt();
//	    int n2 = sc.nextInt();
//	    int n3 = sc.nextInt();
//
	    long[] a = new long[n1];
	    long[] b = new long[n2];
	    long[] c = new long[n3];

//	    for (int i = 0; i < n1; ++i)
//		a[i] = sc.nextLong();
//
//	    for (int i = 0; i < n2; ++i)
//		b[i] = sc.nextLong();
//
//	    for (int i = 0; i < n3; ++i)
//		c[i] = sc.nextLong();
	    for (int i = 0; i < n1; i++)
		a[i] = Long.parseLong(aa1[i]);
	    for (int i = 0; i < n2; i++)
		b[i] = Long.parseLong(bb1[i]);
	    for (int i = 0; i < n3; i++)
		c[i] = Long.parseLong(cc1[i]);

	    int i = 0, j = 0, k = 0;
	    long prev = 0;
	    StringBuilder sb = new StringBuilder();
	    while (i < n1 && j < n2 && k < n3) {

		if (a[i] == b[j] && b[j] == c[k] && a[i] != prev) {
		    prev = a[i];
		    sb.append(prev + " ");
		    i++;
		    j++;
		    k++;
		} else if (a[i] < b[j])
		    i++;
		else if (b[j] < c[k])
		    j++;
		else
		    k++;
	    }

	    System.out.println(sb.length() > 0 ? sb : -1);
	}
    }
}
