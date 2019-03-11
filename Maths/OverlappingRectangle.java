package gfg_int_prep_maths;

import java.util.*;

import java.lang.*;

import java.io.*;

/*
 * The test cases for this question seems to be wrong 
 * or the question is ambiguous*/

class OverlappingRectangle {

	public static void main(String[] args) {

		// code

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			// inputting corners of 1st rectangle

			int xl1 = sc.nextInt();

			int yl1 = sc.nextInt();

			int xr1 = sc.nextInt();

			int yr1 = sc.nextInt();

			// inputting corners of 2nd rectangle

			int xl2 = sc.nextInt();

			int yl2 = sc.nextInt();

			int xr2 = sc.nextInt();

			int yr2 = sc.nextInt();

			/*
			 * 
			 * 2 cases to check --> i) If atleast one of the corners of the 2nd rectangle
			 * (need to decide first which one's the 2nd rectangle)
			 * 
			 * lies within 1st rectangle's boundary ii) Sharing edge case
			 * 
			 */

			int flag = 0;

			// Min and max if the first set of points encloses the 2nd
			int xmin1 = Math.min(xl1, xr1);

			int xmax1 = Math.max(xl1, xr1);

			int ymin1 = Math.min(yl1, yr1);

			int ymax1 = Math.max(yl1, yr1);

			// Min and max if the 2nd set of points encloses the first

			int xmin2 = Math.min(xl2, xr2);

			int xmax2 = Math.max(xl2, xr2);

			int ymin2 = Math.min(yl2, yr2);

			int ymax2 = Math.max(yl2, yr2);

			if (isBounded(xl2, yl2, xmin1, ymin1, xmax1, ymax1) || isBounded(xr2, yl2, xmin1, ymin1, xmax1, ymax1)

					|| isBounded(xl2, yr2, xmin1, ymin1, xmax1, ymax1)
					|| isBounded(xr2, yr2, xmin1, ymin1, xmax1, ymax1)
					|| isBounded(xl1, yl1, xmin2, ymin2, xmax2, ymax2)
					|| isBounded(xr1, yl1, xmin2, ymin2, xmax2, ymax2)
					|| isBounded(xl1, yr1, xmin2, ymin2, xmax2, ymax2)
					|| isBounded(xr1, yr1, xmin2, ymin2, xmax2, ymax2))

				flag = 1;

			// else if(isEdgeSharing(xr1,yl1,xl2,yl2,xr1,yr1,xl2,yl2) ||

			// isEdgeSharing(xr1,yl1,xl2,yl2) ||

			// isEdgeSharing(xr1,yl1,xl2,yl2) || isEdgeSharing(xr1,yl1,xl2,yl2))

			else if ((xr1 == xl2 && yl1 == yl2 && yr1 == yr2) || (xl1 == xl2 && yl1 == yr2 && xr1 == xr2)

					|| (xl1 == xr2 && yl1 == yl2 && yr1 == yr2) || (xl2 == xl1 && yl2 == yr1 && xr1 == xr2))

				flag = 1;

			System.out.println(flag);

		}

	}

	static boolean isBounded(int x1, int y1, int x2, int y2, int x3, int y3) {

		if (x1 > x2 && x1 < x3 && y1 > y2 && y1 < y3)

			return true;

		return false;

	}

	// static boolean isEdgeSharing(int x1, int y1 ,

	// int x2 , int y2 , int x3 , int y3 , int x4 , int y4){

	// }

}