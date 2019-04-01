package gfg_int_prep_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractMaximum {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();

			extractMax(s);
		}
	}

	static void extractMax(String s) {
		int n = s.length();
		int max = 0;
		int num = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9')
				sb.append(ch);

			else if (sb.length() > 0) {
				num = Integer.parseInt(sb.toString());
				max = (num > max ? num : max);
				sb.delete(0, sb.length());
			}
		}

		// necessary check lest the last digit or last number is g.t maximum
		if (sb.length() > 0)
			num = Integer.parseInt(sb.toString());
		System.out.println(max > num ? max : num);
	}
}
