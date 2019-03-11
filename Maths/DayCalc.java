package gfg_int_prep_maths;

import java.util.*;
import java.lang.*;
import java.io.*;

class DayCalc {

	static int nowDay = 22;
	static int nowMonth = 2;
	static int nowYear = 2019;

	static String[] day = { "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };

	static int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int d = sc.nextInt();
			int m = sc.nextInt();
			int y = sc.nextInt();

			// this flag decides whether I am traversing
			// from smaller date to larger date or vice versa
			// flag = -1 means today is future and the date given is past
			// flag = 0 means today and given date are same
			// flag = 1 means given date is a future date
			int flag = isWhichDate(d, m, y);

//			System.out.println(flag);
			// System.out.println(calculateInBetweenYearDays(2019, 2024));

			int days = 0;

			if (flag == -1) {
				// given date = past date ; now = future
				// to traverse from given to
				// 31.12.y + years in between + 1.1.2019 to 21.2.2019

				if (y == nowYear) {
					if (m == nowMonth) {
						days = nowDay - d;
					}

					// month would never be greater than nowMonth else
					// flag would have been 1
					else {
						int temp = 0;
//						days = monthDays[m] - d + 1
						for (int i = 1; i < nowMonth - m; ++i) {

							temp += monthDays[i - 1];
						}

//						if(d == monthDays[m]) {

						if (isLeapYear(y) && m < 2)
							temp += 1;
						days += temp + monthDays[m - 1] - d + 1 + nowDay - 1;

					}
				}

				else {
					days = calculateInBetweenYearDays(y, nowYear) + calculateDaysTillEOY(d, m, y)
							+ calculateDaysFromSOY(nowDay, nowMonth, nowYear);
				}
				System.out.println(day[(7 - (days % 7)) % 7]);
			}

			else if (flag == 1) {
				if (y == nowYear) {
					if (m == nowMonth) {
						days = d - nowDay;
					} else {
						int temp = 0;
//						days = monthDays[m] - d + 1
						for (int i = nowMonth + 1; i < m; ++i) {
							temp += monthDays[i - 1];
						}

						if (isLeapYear(y) && m < 2)
							temp += 1;

//						if(d == monthDays[m]) {
						days += temp + monthDays[nowMonth - 1] - nowDay + 1 + d - 1;

					}
				}

				else {
					days = calculateInBetweenYearDays(nowYear, y) + calculateDaysFromSOY(d, m, y)
							+ calculateDaysTillEOY(nowDay, nowMonth, nowYear);

				}
				System.out.println(day[(days % 7)]);
			}

			else {
				System.out.println(day[0]);
			}
		}

//		else
//			System.out.println();
	}

	static int isWhichDate(int d, int m, int y) {
		int flag = 0;
		if (y > nowYear)
			flag = 1;

		else if (y == nowYear) {
			if (m > nowMonth) {
				flag = 1;
			} else if (m == nowMonth) {
				if (d > nowDay) {
					flag = 1;
				} else if (d < nowDay) {
					flag = -1;
				} else {
					flag = 0;
				}
			} else
				flag = -1;
		} else
			flag = -1;
		return flag;
	}

	static boolean isLeapYear(int y) {
		if (y % 400 == 0)
			return true;

		// Else If a year is muliplt of 100,
		// then it is not a leap year
		if (y % 100 == 0)
			return false;

		// Else If a year is muliplt of 4,
		// then it is a leap year
		if (y % 4 == 0)
			return true;
		return false;
	}

	static int calculateInBetweenYearDays(int y1, int y2) {
		int days = 0;
		int l = 0;
		int cnt = 0;
		for (int i = y1 + 1; i <= y2 - 1; i++) {
			if (isLeapYear(i))
				l++;
			cnt++;
		}

		days += 365 * cnt + l;

		return days;
	}

	static int calculateDaysTillEOY(int d, int m, int y) {
		int days = 0;

		for (int i = m + 1; i <= 11; i++) {
			days += monthDays[i - 1];
		}

		if (isLeapYear(y) && m <= 2)
			days += 1 + monthDays[m - 1] - d + 32;

		else if (m == 12)
			days = 31 - d + 1;

		else
			days += monthDays[m - 1] - d + 32;

		return days;
	}

	static int calculateDaysFromSOY(int d, int m, int y) {
		int days = 0;

		for (int i = 1; i < m; ++i) {
			days += monthDays[i - 1];
		}

		if (isLeapYear(y) && m > 2)
			days += 1 + d - 1;

		else
			days += d - 1;

		return days;
	}

}