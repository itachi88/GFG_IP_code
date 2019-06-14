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

public class SearchRotatedArray_BinarySearch_pivot {
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

	    int k = Integer.parseInt(br.readLine());
	    System.out.println(search(a, 0, n - 1, k));
	}
    }
    
    static int search(int[] a , int lo , int hi , int k) {
	int pivot = pivot(a, lo , hi);
	return pivot;
    }
    
    static int pivot(int[] a , int lo , int hi) {
	if(lo > hi)
	    return -1;
	
	if(hi == lo)
	    return lo;
	
	int mid = (lo+hi)/2;
	
	//if(a[mid])
	return lo;
    }
}
