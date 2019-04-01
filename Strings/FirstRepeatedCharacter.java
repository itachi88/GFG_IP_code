package gfg_int_prep_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FirstRepeatedCharacter {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			firstRepeatedChar(s);
		}
	}

	static void firstRepeatedChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int n = s.length();
		boolean flag = false;
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			}

			else {
				System.out.println(ch);
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(-1);
	}
}
