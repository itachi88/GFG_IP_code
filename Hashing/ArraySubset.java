package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ArraySubset {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int m = in.readInt();

            int[] a = new int[n];
            int[] b = new int[m];

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
                map.put(a[i], 1); //since no repetition given in question
            }

            for (int i = 0; i < m; ++i)
                b[i] = in.readInt();

            boolean flag = true;

            for (int x : b) {
                if (!map.containsKey(x)) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "Yes" : "No");
        }
    }
}
