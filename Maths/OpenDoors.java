package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class OpenDoors {
	public static void main(String[] args) throws IOException {
		// code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int test = Integer.parseInt(str);

		while (test-- > 0) {
			long n = Long.parseLong(br.readLine());
			System.out.println(Math.round(Math.floor(Math.sqrt(n))));
		}
	}
}