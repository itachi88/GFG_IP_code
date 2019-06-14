package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;

public class FrequencyLimitedRangeArrayElements {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = in.readInt() - 1;

            for (int i = 0; i < n; i++) {
                a[a[i] % n] += n;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                sb.append(a[i] / n + " ");
            }

            System.out.println(sb);
        }
    }
}
