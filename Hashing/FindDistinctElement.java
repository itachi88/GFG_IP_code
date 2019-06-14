package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDistinctElement {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = in.readInt();


            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++)
                map.put(a[0][i], 1);

            for (int i = 1; i < n; i++) {
                Arrays.sort(a[i]);

                for (int x : map.keySet()) {
                    if (Arrays.binarySearch(a[i], x) < 0) {
                        map.put(x, 0);
                    }
                }
            }

            int cnt = 0;
            for (int x : map.values()) {
                if (x == 1)
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
