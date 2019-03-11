package gfg_int_prep_arr;

import java.util.*;
import java.lang.*;
import java.io.*;

class CountSmall {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			//int[] cntArr = new int[n]; 
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			
			int count;
			for(int i = 0 ; i < n ; i++) {
				count = 0 ;
				for(int j = i+1 ; j < n ; j++) {
					if(arr[j] < arr[i])
						count++ ;
				}
				
//				cntArr[i] = count ;
				sb.append(count+" ");
			}
			
			System.out.println(sb.toString());
			
		}
	}
}