package gfg_int_prep_arr;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MajorityElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(major(arr, n));
		}
	}

	public static int major(int[] arr, int n) {
		int major = -1;

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < n ; i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			
			else {
				int val = map.get(arr[i]);
				map.put(arr[i], ++val);
			}
			
			if(map.get(arr[i]) > n/2) {
				major = arr[i];
				break;
			}
		}

		return major;
	}
}
