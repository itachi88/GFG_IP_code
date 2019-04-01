package gfg_int_prep_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class UncommonCharacters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s1 = br.readLine();
			String s2 = br.readLine();

			findUncommon(s1, s2);
		}
	}

	static void findUncommon(String s1, String s2) {
		Set<Character> ss1 = new TreeSet<>();
		Set<Character> ss2 = new TreeSet<>();
		int n1 = s1.length();
		int n2 = s2.length();

		for (int i = 0; i < n1; ++i)
			ss1.add(s1.charAt(i));

		for (int i = 0; i < n2; ++i)
			ss2.add(s2.charAt(i));

		/*
		 * added char infinity to the smaller set so that I can continue iterating even
		 * though one of the sets is empty
		 **/

		// reusing n1 and n2 to store set size
		n1 = ss1.size();
		n2 = ss2.size();

		ss1.add(Character.MAX_VALUE);
		ss2.add(Character.MAX_VALUE);

		int i = 0, j = 0;

		// Since I can't walk through 2 sets at once , I convert them to arrays
		Character[] c1 = ss1.toArray(new Character[ss1.size()]);
		Character[] c2 = ss2.toArray(new Character[ss2.size()]);

		Character[] big = (n1 > n2) ? c1 : c2;
		Character[] small = (n1 <= n2) ? c1 : c2;

		StringBuilder sb = new StringBuilder();

		while (i < big.length && j < small.length) {

			if (big[i] < small[j])
				sb.append(big[i++]);

			else if (big[i] > small[j])
				sb.append(small[j++]);

			else {
				i++;
				j++;
			}
		}

		System.out.println(sb.toString());
	}
}
