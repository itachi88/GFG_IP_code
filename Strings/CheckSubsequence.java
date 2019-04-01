package gfg_int_prep_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSubsequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");
			String a = strs[0];
			String b = strs[1];
			isSubsequence(a, b);
		}

	}

	static void isSubsequence(String a, String b) {
		int j = 0;
		int m = a.length();
		int n = b.length();
		for (int i = 0; i < n && j < m; i++) {
			if (a.charAt(j) == b.charAt(i))
				j++;
		}

		System.out.println(j == m ? 1 : 0);
	}
}
