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
import java.util.Collections;

public class Squareroot {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while (t-- > 0) {
	    int x = Integer.parseInt(br.readLine());
	    System.out.println(floorSqrt(x));
	}
    }
    
    static int floorSqrt(int x) {
	int lo = 1; 
	int hi = x ;
	int mid;
	int ret= 0;
	while(lo <= hi) {
	    mid= (lo +hi)/2;
	    int sqr = mid*mid;
	    if(sqr == x || mid == lo) {
		ret = mid;
		break;
	    }
	    
	    else if(sqr < x)
		lo = mid;
	    
	    else
		hi = mid;
		
	}
 
	return ret;
    }
}
