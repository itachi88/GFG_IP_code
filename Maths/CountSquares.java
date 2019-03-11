package gfg_int_prep_maths;

import java.util.Scanner;
class CountSquares
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0) {
	        long n = sc.nextLong();
	        
	        System.out.println(Math.round(Math.floor(Math.sqrt(n-1))));
	    }
	 }
}
