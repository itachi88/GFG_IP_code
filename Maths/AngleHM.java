package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
import java.io.*;

class AngleHM {
	public static void main(String[] args) throws IOException {
		// code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
// 			int h = Integer.parseInt(br.readLine());
// 			double m = Double.parseDouble(br.readLine());

			String hh_mm = br.readLine();
			String[] arr = hh_mm.split(" ");

			int h = Integer.parseInt(arr[0]);
			double m = Double.parseDouble(arr[1]);

			double angH_12 = (h * 30 + ((m % 60) * 0.5));
			double angM_12 = ((m % 60) * 6);

			double angBetweenHM = Math.abs(angH_12 - angM_12);
			angBetweenHM = Math.min(360 - angBetweenHM, angBetweenHM);
			DecimalFormat d = new DecimalFormat("###");
			System.out.println(d.format(Math.floor(angBetweenHM)));

		}

	}
}