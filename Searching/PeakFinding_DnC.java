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

public class PeakFinding_DnC {
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

	    System.out.println(peak(a, n));
	}
    }
    
    static int peak(int[] a , int n) {
	return findPeak(a , 0 , n-1);
    }
    
    static int findPeak(int[] a , int lo , int hi) {
	int mid = lo + (hi-lo)/2;
	
	if((mid == 0 || a[mid] >= a[mid-1]) && (mid == a.length-1 || a[mid] >= a[mid+1]))
	    return mid;
	
	else if(mid > 0 && a[mid] < a[mid-1])
	    return findPeak(a,lo,mid-1);
	else 
	    return findPeak(a, mid+1, hi);
    }
}
