package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class JumpingNumbers {

	static Queue<Integer> jump = new LinkedList<>();
	static Set<Integer> res = new TreeSet<>();

	public static void main(String[] args) throws IOException {
		// code
		generateJumping(100000000);

//		for (Integer x : res) {
//			System.out.println(x + " ");
//		}

// 		Scanner sc = new Scanner(System.in);
// 		int t = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			Integer n = Integer.parseInt(br.readLine());
			for (Integer x : res) {
				if (x > n)
					break;
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	static void generateJumping(Integer n) {
		for (int i = 0; i <= 9; i++)
			jump.add(i);
//		
//		Set<Integer> set = new TreeSet<>();
//		
//		Iterator<Integer> it = jump.iterator();

		while (!jump.isEmpty()) {
			Integer i = jump.poll();

			Integer lsb = i % 10;
			Integer msb = i / pow10(digits(i) - 1);
			Integer num = 1;

			if (lsb != 9) {
				num = (i * 10 + (lsb + 1));
				if (num > i)
					jump.add(num);
			}
			if (lsb != 0) {
				num = (i * 10 + (lsb - 1));
				if (num > i)
					jump.add(num);
			}

			if (msb != 9) {
				num = (msb + 1) * pow10(digits(i)) + i;
				if (num > i)
					jump.add(num);
			}
			if (msb != 0) {
				num = ((msb - 1) * pow10(digits(i)) + i);
				if (num > i)
					jump.add(num);
			}

			res.add(i);
		}

	}

	static Integer pow10(int n) {
		Integer pow = 1;
		for (int i = 0; i < n; i++) {
			pow = pow * 10;
		}

		return pow;
	}

//		

	static int digits(Integer n) {
		int digits = 1;
		if (n >= 0 && n <= 9)
			digits = 1;
		else if (n >= 10 && n <= 99)
			digits = 2;
		else if (n >= 100 && n <= 999)
			digits = 3;
		else if (n >= 1000 && n <= 9999)
			digits = 4;
		else if (n >= 10000 && n <= 99999)
			digits = 5;
		else if (n >= 100000 && n <= 999999)
			digits = 6;
		else if (n >= 1000000 && n <= 9999999)
			digits = 7;
		else if (n >= 10000000 && n <= 99999999)
			digits = 8;
		else if (n >= 100000000 && n <= 999999999)
			digits = 9;

		return digits;
	}
}