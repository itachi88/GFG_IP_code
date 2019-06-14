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

public class MagnetArrayProblem {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    int n = Integer.parseInt(br.readLine());
	    String str = br.readLine();
	    String[] strs = str.trim().split("\\s+");
	    int[] a = new int[n];
	    for (int i = 0; i < n; ++i)
		a[i] = Integer.parseInt(strs[i]);
	    
	    for(int i = 0 ; i < n-1 ; i++) {
		double x = magnet(a[i] , a[i+1] , a , n);
		System.out.printf("%.2f",x);
		System.out.print(" ");
	    }
	    System.out.println();
	}
    }
    
    static double magnet(double lo , double hi , int a[] , int n) {
	
	double d = 0.0000000000001;
	double m = lo + (hi-lo)/2 ;
	double b;
	double force = 0;
	
	for(int i = 0 ; i < n ;++i) {
	    b = 1/(m-a[i]);
	    force+=b;
	}
	
	if(Math.abs(force) < d)
	    return m;
	
	else {
	    if(force > 0)
		return magnet(m , hi , a , n);
	    
	    return magnet(lo , m , a ,n);
	}
    }
    
    
}
